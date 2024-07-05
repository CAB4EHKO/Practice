package ru.uni;

public class HeirClass extends Parent {

    @Override
    protected String print() {
        return "Reborn world!";
    }

    public void printMessage() {
        String message = print();
        System.out.println(message);
    }
}
