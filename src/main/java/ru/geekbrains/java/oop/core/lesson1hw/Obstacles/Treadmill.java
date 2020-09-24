package ru.geekbrains.java.oop.core.lesson1hw.Obstacles;

import ru.geekbrains.java.oop.core.lesson1hw.Participants.Runner;

public class Treadmill implements ru.geekbrains.java.oop.core.lesson1hw.Obstacles.Obstacles {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void check(Runner runner) {
        runner.run();
        runner.setSuccess(runner.getMaxLength() >= length);
        if (Runner.getSuccess()) {
            System.out.println("Бегун " + runner.getName() + " выполнил испытание, пробежав дорожку длиной: " + length);
        } else {
            System.out.println("Бегун " + runner.getName() + " не пробежал дорожку длиной: " + length);
        }
    }
}