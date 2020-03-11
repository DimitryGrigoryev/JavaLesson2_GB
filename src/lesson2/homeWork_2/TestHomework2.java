package lesson2.homeWork_2;

public class TestHomework2 {
    private static final int SIZE = 4;
    private static int SUM = 0;

    public static void main(String[] args) {

        String[][] testArray1 = {{"1", "11", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println("testArray1");
        doSum(testArray1);
        String[][] testArray2 = {{"1", "11", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println("testArray2");
        doSum(testArray2);

        String[][] testArray3 = {{"1", "11", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println("testArray3");
        doSum(testArray3);

        String[][] testArray4 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "C", "1"}};
        System.out.println("testArray4");
        doSum(testArray4);

        String[][] testArray5 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "C", "1"}};
        System.out.println("testArray5");
        doSum(testArray5);
    }

    private static void doSum(String[][] testArray1) {
        try {
            sumArray(testArray1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }

    private static void sumArray(String[][] testArray1) {
        checkSizeArray(testArray1);
        checkDataAndSum(testArray1);
    }

    private static void checkDataAndSum(String[][] testArray1) throws MyArrayDataException {
        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                int string1 = checkData(testArray1[i][j], i, j);
                SUM = SUM + string1;
            }
        }
        System.out.println("Данные в ячейках верные!");
        System.out.println("Сумма по всем элементам массива = " + SUM);
    }

    private static int checkData(String s, int i, int j) throws MyArrayDataException {
        int string1;
        try {
            string1 = Integer.parseInt(s.trim());
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Неверный формат данный в ячейке [" + (i + 1) + "][" + (j + 1) + "].");
        }
        return string1;
    }

    private static void checkSizeArray(String[][] testArray1) throws MyArraySizeException {
        if (testArray1.length != SIZE) {
            throw new MyArraySizeException("Размер по количеству строк не тот");
        } else System.out.println("По количеству строк ОК!");

        for (String[] strings : testArray1) {
            if (strings.length != SIZE) {
                throw new MyArraySizeException("Размер по длинне строк не тот");
            }
        }
        System.out.println("По длинне строк ОК!");
    }
}
