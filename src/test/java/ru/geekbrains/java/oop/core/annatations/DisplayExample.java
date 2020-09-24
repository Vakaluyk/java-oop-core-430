package ru.geekbrains.java.oop.core.annatations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisplayExample {

    @Test
    public void checkSumCorrect(){
        Assertions.assertEquals(2,1+1);
    }


    @Disabled (value = "Отключен до лучших времен")
    @Test
    public void checkSumException(){
        Assertions.assertEquals(3,1+1);
    }
}
