package Classwork.Task3;

//В рамках выполнения задачи необходимо:
//Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
//Найдите человека с самым маленьким номером телефона
//Найдите номер телефона человека чье имя самое большое в алфавитном порядке

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("89147469377", "Ivan");
        phoneBook.put("89759572256", "Sergey");
        phoneBook.put("89986597738", "Sasha");
        phoneBook.put("89379967745", "Petr");

        System.out.println(findByMinPhoneNumber(phoneBook));
        System.out.println(findByMaxAlphabetName(phoneBook));
    }

    public static String findByMinPhoneNumber(Map<String, String> phoneBook) {
        Set<Long> numbers = phoneBook.keySet().stream().map(el -> Long.valueOf(el)).collect(Collectors.toSet());
        long number = numbers.stream().min(Comparator.naturalOrder()).get();
        return String.format("Minimum number: %s, owner: %s", number, phoneBook.get(String.valueOf(number)));
    }

    public static String findByMaxAlphabetName(Map<String, String> phoneBook) {
        Set<Map.Entry<String, String>> elements = phoneBook.entrySet();
        Map.Entry<String, String> name = elements.stream().max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())).get();
        return String.format("Max alphabet name: %s, phone number: %s", name.getValue(), name.getKey());
    }
}

