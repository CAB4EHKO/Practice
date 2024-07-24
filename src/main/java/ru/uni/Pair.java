package ru.uni;

import java.util.function.BiFunction;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    // Метод map для преобразования пары значений с помощью трансформера
    public <R, S> Pair<R, S> map(PairTransformer<T, U, R, S> transformer) {
        return transformer.transform(first, second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first = " + first +
                ", second = " + second +
                '}';
    }
}