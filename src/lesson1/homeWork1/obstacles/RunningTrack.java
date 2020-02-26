package lesson1.homeWork1.obstacles;

import lesson1.homeWork1.Obstacles;
import lesson1.homeWork1.Participants;

public class RunningTrack implements Obstacles {
    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public boolean doAction(Participants runnerParticipants) {
        int runLength = runnerParticipants.run();
        return runLength >= length;
    }
}
