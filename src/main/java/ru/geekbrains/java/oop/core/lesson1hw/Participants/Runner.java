package ru.geekbrains.java.oop.core.lesson1hw.Participants;

public interface Runner {

    String getName();

    int getMaxLength();

    int getMaxWeight();

    static boolean getSuccess() {
        return false;
    }

    void setSuccess(boolean success);
    void run();
    void jump();


}