package lesson1.homeWork1.participants;

import lesson1.homeWork1.Participants;

public class Cat implements Participants {
    public static final int RUN_LENGTH = 25;
    private static final int JUMP_HEIGHT = 2;

    @Override
    public int jump() {
        System.out.println("____________________");
        System.out.println("Кот попробовал прыгнуть!");
        return JUMP_HEIGHT;
    }

    @Override
    public int run() {
        System.out.println("____________________");
        System.out.println("Кот попробовал пробежать трек!");
        return Participants.DEFAULT_RUN_LENGTH;
    }
}
