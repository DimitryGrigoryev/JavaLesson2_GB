package lesson1.homeWork1;

import lesson1.homeWork1.obstacles.RunningTrack;
import lesson1.homeWork1.obstacles.Wall;
import lesson1.homeWork1.participants.Cat;
import lesson1.homeWork1.participants.Human;
import lesson1.homeWork1.participants.Robot;

public class TestHomework1 {

    public static void main(String[] args) {
        Wall wall = new Wall(1);
        RunningTrack runningTrack = new RunningTrack(250);

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        Obstacles[] obstacles = {wall, runningTrack};
        Participants[] participants = {human, cat, robot};

        action(participants, obstacles);
    }

    private static void action(Participants[] participants, Obstacles[] obstacles) {
        for (Participants participant : participants) {
            for (Obstacles obstacle : obstacles) {
                if (obstacle.doAction(participant)) {
                    System.out.println("Успешно!");
                } else {
                    System.out.println("Не смог!");
                    break;
                }
            }
        }
    }
}
