package lesson1.homeWork1.participants;

import lesson1.homeWork1.Participants;

public class Human implements Participants {


    private static final int JUMP_HEIGHT = 1;
    private static final int RUN_LENGTH = 500;

    @Override
    public int jump() {
        System.out.println("____________________");
        System.out.println("Человек попробовал прыгнул!");
        return Participants.DEFAULT_JUMP_HEIGHT;
    }

    @Override
    public int run() {
        System.out.println("____________________");
        System.out.println("Человек попробовал пробежать трек!");
        return RUN_LENGTH;
    }
}
