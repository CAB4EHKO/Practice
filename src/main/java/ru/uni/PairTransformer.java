package ru.uni;

public interface PairTransformer<T, U, R, S> {
    Pair<R, S> transform(T t, U u);
}
