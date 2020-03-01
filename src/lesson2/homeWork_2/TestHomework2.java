package lesson2.homeWork_2;

public class TestHomework2 {
    public static void main(String[] args) {
        int SIZE = 4;
        int SUM = 0;
        String[][] testArray1 = {{"1", "11", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println("testArray1");
        doSum(SIZE, SUM, testArray1);
        String[][] testArray2 = {{"1", "11", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println("testArray2");
        doSum(SIZE, SUM, testArray2);

        String[][] testArray3 = {{"1", "11", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println("testArray3");
        doSum(SIZE, SUM, testArray3);

        String[][] testArray4 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "C", "1"}};
        System.out.println("testArray4");
        doSum(SIZE, SUM, testArray4);
    }

    private static void doSum(int SIZE, int SUM, String[][] testArray1) {
        try {
            sumArray(SIZE, testArray1, SUM);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally block");
        }
    }

    private static void sumArray(int SIZE, String[][] testArray1, int SUM) {
        checkSizeArray(SIZE, testArray1);
        checkDataAndSum(testArray1, SUM);
    }

    private static void checkDataAndSum(String[][] testArray1, int SUM) throws MyArrayDataException {
        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                int string1 = checkData(testArray1[i][j], i , j );
                SUM = SUM + string1;
            }
        }
        System.out.println("Сумма по всем элементам массива = " + SUM);
    }

    private static int checkData(String s,int i,int j) throws MyArrayDataException {
        int string1;
        try {
            string1 = Integer.parseInt(s.trim());
        } catch (NumberFormatException e) {
            System.out.printf("Неверный формат данный в ячейке [%d][%d]\n", (i + 1), (j + 1));
            throw new MyArrayDataException();
        }
        System.out.println("Данные в ячейках верные!");
        return string1;
    }

    private static void checkSizeArray(int SIZE, String[][] testArray1) throws MyArraySizeException {
        if (testArray1.length < SIZE) {
            System.out.println("Размер по количеству строк не тот");
            throw new MyArraySizeException();
        } else System.out.println("По количеству строк ОК!");

        for (String[] strings : testArray1) {
            if (strings.length < SIZE) {
                System.out.println("Размер по длинне строк не тот");
                throw new MyArraySizeException();
            }
        }
        System.out.println("По длинне строк ОК!");
    }
}
