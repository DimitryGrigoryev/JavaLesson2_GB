package lesson1.homeWork1.participants;

import lesson1.homeWork1.Participants;

public class Robot implements Participants {
    private static final int JUMP_HEIGHT = 0;
    private static final int RUN_LENGTH = 1000;

    @Override
    public int jump() {
        System.out.println("____________________");
        System.out.println("Робот попробовал прыгнуть!");
        return JUMP_HEIGHT;
    }

    @Override
    public int run() {
        System.out.println("____________________");
        System.out.println("Робот попробовал пробежать трек!");
        return RUN_LENGTH;
    }
}
