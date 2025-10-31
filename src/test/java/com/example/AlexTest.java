package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    private Feline feline;

    @Test
    public void testGetFriends() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testAlexIsMale() throws Exception {
        Alex alex = new Alex(feline);
        assertTrue(alex.doesHaveMane());
    }
}