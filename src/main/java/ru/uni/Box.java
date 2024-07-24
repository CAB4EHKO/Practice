package ru.uni;

public class Box<T extends Number> {
   private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double avg() {
        double result = 0;
        for(T element : array) {
            result += element.doubleValue();
        }
        return result / array.length;
    }

    public int compare(Box<?> another) {
        if(avg() > another.avg() || avg() < another.avg()) {
            return 1;
        } else if (avg() == another.avg()) {
            return 0;
        } else {
            return -1;
        }
    }
}
