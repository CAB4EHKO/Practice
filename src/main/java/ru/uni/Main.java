package ru.uni;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Pair с начальными значениями "Hello" и 42
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println("Оригинальная пара: " + pair);

        // Преобразуем значения пары с помощью анонимного класса, реализующего интерфейс PairTransformer
        Pair<Integer, String> newPair = pair.map((str, num) -> {
            // Преобразуем строку в её длину
            Integer newFirst = str.length();
            // Создаем новую строку, объединяя оригинальную строку и число
            String newSecond = str + " " + num;
            // Возвращаем новую пару с преобразованными значениями
            return new Pair<>(newFirst, newSecond);
        });
        System.out.println("Преобразованная пара: " + newPair);
    }
}