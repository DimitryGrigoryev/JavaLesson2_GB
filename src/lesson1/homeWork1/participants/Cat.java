package lesson1.homeWork1.participants;

import lesson1.homeWork1.Participants;

public class Cat implements Participants {
    private final String name;
    private final int jumpHeight;
    private final int maxRunLength;

    public Cat(String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }


    @Override
    public int jump() {
        System.out.println("____________________");
        System.out.printf("Кот %s попробовал прыгнул %d%n!", name, jumpHeight);
        return jumpHeight;
    }

    @Override
    public int run() {
        System.out.println("____________________");
        System.out.printf("Кот %s попробовал пробежать трек %d%n!", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", maxRunLength=" + maxRunLength +
                '}';
    }
}
