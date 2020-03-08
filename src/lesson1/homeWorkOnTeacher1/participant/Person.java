package lesson1.homeWorkOnTeacher1.participant;

public class Person implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int maxRunLength;

    public Person(String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int run() {
//        String message = "Человек " + name + " бежит дистанцию " + maxRunLength;
//        System.out.println(message);
        System.out.printf("Человек %s бежит дистанцию %d%n", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Человек %s делает прыжок %d%n", name, jumpHeight);
        return jumpHeight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", maxRunLength=" + maxRunLength +
                '}';
    }
}
