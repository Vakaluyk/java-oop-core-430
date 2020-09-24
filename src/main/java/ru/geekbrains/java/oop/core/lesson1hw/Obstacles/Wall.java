package ru.geekbrains.java.oop.core.lesson1hw.Obstacles;

import ru.geekbrains.java.oop.core.lesson1hw.Participants.Runner;

public class Wall implements ru.geekbrains.java.oop.core.lesson1hw.Obstacles.Obstacles {
    private int width;

    public Wall(int width) {
        this.width = width;
    }

    public void check(Runner runner) {
        runner.jump();
        runner.setSuccess(runner.getMaxWeight() >= width);
        if (Runner.getSuccess()) {
            System.out.println("Прыгун " + runner.getName() + " выполнил испытание, перепрыгнув стену высотой: " + width);
        } else {
            System.out.println("Прыгун " + runner.getName() + " не перепрыгнул стену высотой: " + width);
        }
    }
}
