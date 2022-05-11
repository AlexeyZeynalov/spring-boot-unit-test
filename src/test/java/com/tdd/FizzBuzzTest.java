package com.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    //if number is divisible by 3, print Fizz
    //if number is divisible by 5, print Buzz
    //if number is divisible by 3 and 5, print FizzBuzz
    //if number is not divisible by 3 or 5, then print the number

    @Test
    @DisplayName("Divisible by three")
    @Order(1)
    void testForDivisibleByThree() {

        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");

    }
}
