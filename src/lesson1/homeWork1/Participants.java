package lesson1.homeWork1;

public interface Participants {
    int DEFAULT_JUMP_HEIGHT = 1;
    int DEFAULT_RUN_LENGTH = 25;

    default int jump() {
        return DEFAULT_JUMP_HEIGHT;
    }

    default int run() {
        return DEFAULT_RUN_LENGTH;
    }
}
