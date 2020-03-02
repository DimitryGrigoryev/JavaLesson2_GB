package lesson3.homework3;

import java.util.*;

public class DuplicateCheck {
    public static void main(String[] args) {
        LinkedList<String> newDataArray = getStrings();

        Set<String> setDataArray = getStrings(newDataArray);

        checkDuplicate(newDataArray, setDataArray);
    }

    private static LinkedList<String> getStrings() {
        LinkedList<String> newDataArray = new LinkedList<>();
        newDataArray.add("Иванов");
        newDataArray.add("Петров");
        newDataArray.add("Сидоров");
        newDataArray.add("Иванов");
        newDataArray.add("Иванов");
        newDataArray.add("Соколов");
        newDataArray.add("Петров");
        newDataArray.add("Петров");
        newDataArray.add("Петров");
        newDataArray.add("Петров");
        newDataArray.add("Петров");
        newDataArray.add("Сидоров");
        System.out.println(newDataArray);
        return newDataArray;
    }

    private static Set<String> getStrings(LinkedList<String> newDataArray) {
        Set<String> setDataArray = new TreeSet<>();
        setDataArray.addAll(newDataArray);
        System.out.println(setDataArray);
        return setDataArray;
    }

    private static void checkDuplicate(LinkedList<String> newDataArray, Set<String> setDataArray) {
        for (String s : setDataArray) {
            int k = 0;
            for (String s1 : newDataArray) {
                if (s.equals(s1)) {
                    k++;
                }
            }
            System.out.printf("Слово %s повторяется %d раз(а).\n", s, k);
        }
    }
}
