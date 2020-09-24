package ru.geekbrains.java.oop.core.lesson2hw;

public class MyArrayDataException extends RuntimeException {
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Wrong data. You have: row " + i + ", column " + j);
        this.i = i;
        this.j = j;
    }
}
