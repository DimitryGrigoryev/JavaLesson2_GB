package lesson3.homework3;

import java.util.HashMap;
import java.util.Map;

public class TestPhonebook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        add(phoneBook, "89139111112", "Петров");
        add(phoneBook, "89139111113", "Сидоров");
        add(phoneBook, "89139111114", "Квашнин");
        add(phoneBook, "89139111115", "Иванов");
        add(phoneBook, "89139111116", "Зайков");
        add(phoneBook, "89139111117", "Олейников");
        add(phoneBook, "89139111118", "Петров");
        add(phoneBook, "89139111119", "Лосев");
        add(phoneBook, "89139111120", "Петров");
        printInfo(phoneBook);

        get(phoneBook, "Лосев");
        get(phoneBook, "Петров");
    }

    static void add(Map<String, String> phoneBook, String k, String v) {
        phoneBook.put(k, v);
    }

    static void get(Map<String, String> phoneBook, String one) {
        System.out.println("_______________");
        for (Map.Entry<String, String> o : phoneBook.entrySet()) {
            if (o.getValue().equals(one)) {
                System.out.println(o.getValue() + ": " + o.getKey());
            }
        }
    }

    static void printInfo(Map<String, String> phoneBook) {
        System.out.println("Начало справочника:");
        for (String key : phoneBook.keySet()) {
            String value = phoneBook.get(key);
            System.out.println(key + " - " + value);
        }
        System.out.println("Конец");

    }
}
