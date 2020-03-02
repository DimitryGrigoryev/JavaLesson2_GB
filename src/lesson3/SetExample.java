package lesson3;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String args[]) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("Aльфa");
        set.add("Бета");
        set.add("Aльфa");
        set.add("Этa");
        set.add("Гaммa");
        set.add("Эпсилон");
        set.add("Омега");
        set.add("Гaммa");
        System.out.println(set);

        System.out.println("---------");


        Set<Person> personSet = new TreeSet<Person>();
//        Set<Person> personSet = new TreeSet<Person>(Comparator.comparing(Person::getName));
//        Set<Person> personSet = new TreeSet<Person>(Comparator.comparing(person -> person.getName()));
//        Set<Person> personSet = new TreeSet<Person>(Comparator.comparing(new Function<Person, String>() {
//            @Override
//            public String apply(Person person) {
//                return person.getName();
//            }
//        }));
        Person oleg   = new Person("Petrov", "Oleg", 27);
        Person alexey = new Person("Petrov", "Alexey", 29);
        personSet.add(oleg);
        personSet.add(alexey);

        for (Person person : personSet) {
            System.out.println(person);
        }
    }


}
