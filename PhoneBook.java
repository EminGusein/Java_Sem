package PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    // Добавляет запись в телефонную книгу
    public void add(String name, Integer phoneNum) {

        ArrayList<Integer> phoneNums = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNums.add(phoneNum);
        phoneBook.put(name, phoneNums);
    }

    // Поиск номеров телефона по имени в телефонной книге
    public ArrayList<Integer> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());

    }

    // Выводит всю телефонную книгу
    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public void printPhoneBook() {
        ArrayList<Map.Entry<String, ArrayList<Integer>>> list = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList<Integer>>>() {

            @Override
            public int compare(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }

        });

        for (Map.Entry<String, ArrayList<Integer>> entry : list) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
