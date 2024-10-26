package Classwork.Task2;

//В рамках выполнения задачи необходимо:
//Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
//Получите уникальный список Set на основании List
//Определите наименьший элемент (алфавитный порядок)
//Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
//Удалите все элементы содержащие букву ‘A’

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList(Arrays.asList("Sergey", "Valya", "Sasha", "Irina", "Ivan", "Sergey", "Kirill", "Ilona", "Irina"));

        Set<String> setNames = convertListToSet(names);
        System.out.println(setNames);
        System.out.println("Min alphabet name: " + minLengthName(setNames));
        List<String> minAndMaxNames = minAndMaxLengthNames(setNames);
        System.out.printf("Min length name: %s, max length name: %s", minAndMaxNames.get(0), minAndMaxNames.get(1));
        removeNamesByChar(setNames, 'A');
        System.out.println();
        System.out.println("After remove A: " + setNames);
    }

    public static Set<String> convertListToSet(List<String> list){
        return new HashSet<>(list);
    }

    public static String minLengthName(Set<String> names){
        return names.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public static List<String> minAndMaxLengthNames(Set<String> names){
        List<String> resultNames = new ArrayList<>();
        resultNames.add(names.stream().min(Comparator.comparing(String::length)).orElse(null));
        resultNames.add(names.stream().max(Comparator.comparing(String::length)).orElse(null));
        return resultNames;
    }

    public static void removeNamesByChar(Set<String> names, char symbol){
        names.removeIf(name -> name.contains(String.valueOf(symbol).toLowerCase()));
    }
}

