package lesson1.homeWork1.obstacles;

import lesson1.homeWork1.Obstacles;
import lesson1.homeWork1.Participants;

public class Wall implements Obstacles {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean doAction(Participants jumperParticipants) {
        int jumpHeight = jumperParticipants.jump();
        return jumpHeight >= height;

    }
}
