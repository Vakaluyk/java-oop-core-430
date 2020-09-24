package ru.geekbrains.java.oop.core.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertArrayEqualsExample {

    @Test
    public void checkSumCorrect(){
        String[] cats1 = { "Барсик", "Барсик"};
        String[] cats2 = { "Барсик", "Мурзик"};
       Assertions.assertArrayEquals(cats1,cats2);
    }

}
