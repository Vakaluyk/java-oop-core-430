package ru.geekbrains.java.oop.core.annatations;


import com.sun.javafx.fxml.expression.ExpressionValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.rmi.UnexpectedException;
import java.util.stream.Stream;

public class ParameterizedTestExample {


//    @Test
//    public void checkSumCorrect1() {
//    Assertions.assertEquals(2, 1 + 1);
//    }
//    @Test
//    public void checkSumCorrect2() {
//    Assertions.assertEquals(3, 2+ 1);
//    }
//    @Test
//    public void checkSumCorrect3() {
//    Assertions.assertEquals(4, 3+ 1);
//    }
//    @Test
//    public void checkSumCorrect4() {
//        Assertions.assertEquals(5, 4 + 1);
//    }
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void checkSum(int expectedValue, int sum) {
        Assertions.assertEquals(expectedValue,sum+1);
    }
    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(2, 10),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 4)
        );
    }


}