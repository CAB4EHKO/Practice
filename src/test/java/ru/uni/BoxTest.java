package ru.uni;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {

        Box<Integer> box1 = new Box<>(10, 5, 15);
        Box<Float> box2 = new Box<>(10f, 5f, 15f);

        assertEquals(0, box1.compare(box2));
    }
}