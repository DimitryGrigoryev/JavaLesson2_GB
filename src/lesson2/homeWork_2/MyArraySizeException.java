package lesson2.homeWork_2;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Не верный размер массива!");
    }
}
