package ru.geekbrains.java.oop.core.annatations.before.and.after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BeforConfigTest {
    @BeforeAll
    public static void beforeAllBeforConfigTest() {
        System.out.println("BeforConfigTest.beforeAll");
    }

    @BeforeEach
    public  void setUpBeforConfigTest() {
        System.out.println("BeforConfigTest.setUpBeforConfigTest");
    }

    @AfterEach
    public void tearDownBeforConfigTest() {
        System.out.println("BeforConfigTest.tearDownBeforConfigTest");
    }



    @AfterAll
    public static void afterAllBeforConfigTest() {
        System.out.println("BeforConfigTest.afterAllBeforConfigTest");

    }


}
