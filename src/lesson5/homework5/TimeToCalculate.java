package lesson5.homework5;

public class TimeToCalculate {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {
        float[] arr = new float[SIZE];
        arrToOne(arr);
        oneThread(arr);
        twoThread(arr);
    }

    static void twoThread(float[] arr) throws InterruptedException {
        long b = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        Thread thread1 = new Thread(() -> calculate(a1, HALF));
        Thread thread2 = new Thread(() -> calculate(a2, HALF));
        thread1.start();
        thread2.start();

        thread2.join();
        thread2.join();

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.printf("b= %d%n", (System.currentTimeMillis() - b));
    }

    static void oneThread(float[] ar) {
        long a = System.currentTimeMillis();
        calculate(ar, SIZE);
        System.out.printf("a= %d%n", (System.currentTimeMillis() - a));
    }

    static void arrToOne(float[] arr) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
    }

    static void calculate(float[] arr, int size) {
        for (double i = 0; i < size; i++) {
            arr[(int) i] = (float) (arr[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
