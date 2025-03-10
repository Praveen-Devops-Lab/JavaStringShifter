package com.stringshifter.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stringshifter.StringShifter;

class StringShifterTest {

	@Test
    void testStringShift() {
        assertEquals("efabcd", StringShifter.shiftCharacters("abcdef", 2));
        assertEquals("worldhello", StringShifter.shiftCharacters("helloworld", 5));
    }

    @Test
    void testNegativeShift() {
        assertEquals("cdefab", StringShifter.shiftCharacters("abcdef", -2));
        assertEquals("lohel", StringShifter.shiftCharacters("hello", -3));
    }

    @Test
    void testZeroShift() {
        assertEquals("abcdef", StringShifter.shiftCharacters("abcdef", 0));
    }

    @Test
    void testEqualToLength() {
        assertEquals("abcdef", StringShifter.shiftCharacters("abcdef", 6));
    }

    @Test
    void testGreaterThanLength() {
        assertEquals("efabcd", StringShifter.shiftCharacters("abcdef", 8));
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringShifter.shiftCharacters("", 3));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", StringShifter.shiftCharacters("a", 1));
        assertEquals("a", StringShifter.shiftCharacters("a", -1));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals("aaaaaa", StringShifter.shiftCharacters("aaaaaa", 3));
    }

}
	