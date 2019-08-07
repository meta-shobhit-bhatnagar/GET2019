package com.shobhit.q2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharactersTestCase {

    UniqueCharacters stringObject = new UniqueCharacters();

    /**
     * When single string contains both unique And repeated characters and returns no. of UniqueCharacters
     */
    @Test
    public void test1() {
        assertEquals(1, stringObject.countUniqueCharacters("abcdabcee"));
    }

    /**
     * When single string contains only repeated characters and returns zero
     */
    @Test
    public void test2() {
        assertEquals(0, stringObject.countUniqueCharacters("eeedd"));
    }
    
    /**
     * It counts Unique Characters. When string is passed it returns number of unique characters
     */
    @Test
    public void test3() {
        assertEquals(2, stringObject.countUniqueCharacters("This is the pen"));
        assertEquals(4, stringObject.countUniqueCharacters("My name is Ayushi"));
    }

    /**
     * It counts Unique Characters. When String has both words of opposite cases only. It returns 1 because " " is unique
     */
    @Test
    public void test4() {
        assertEquals(1, stringObject.countUniqueCharacters("THIS this"));
    }

    /**
     * When unique string is frequently called. It returns number of unique characters using cache
     */
    @Test
    public void test5() {
        assertEquals(5, stringObject.countUniqueCharacters("This name is unique"));
        assertEquals(4, stringObject.countUniqueCharacters("unique"));
        assertEquals(4, stringObject.countUniqueCharacters("name"));
    }
}