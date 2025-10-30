package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int kittensCount;
    private final int expectedCount;

    public FelineTest(int kittensCount, int expectedCount) {
        this.kittensCount = kittensCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                {1, 1},
                {3, 3},
                {5, 5},
                {0, 0}
        };
    }

    @Test
    public void testGetKittensWithParameter() {
        Feline feline = new Feline();
        assertEquals(expectedCount, feline.getKittens(kittensCount));
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}