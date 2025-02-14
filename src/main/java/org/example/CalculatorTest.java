package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    // Test for add function with two positive numbers
    @Test
    void testAddTwoPositiveNumbers() {
        Assertions.assertEquals(3, add(1, 2));  // Expected: 3
    }

    // Test for add function with two negative numbers
    @Test
    void testAddTwoNegativeNumbers() {
        Assertions.assertEquals(-2, add(-1, -1));  // Expected: -2
    }

    // Test for add function with multiple numbers
    @Test
    void testAddMultipleNumbers() {
        Assertions.assertEquals(15, add(1, 2, 3, 4, 5));  // Expected: 15
    }

    // Test for multiply function with two positive numbers
    @Test
    void testMultiplyTwoPositiveNumbers() {
        Assertions.assertEquals(6, multiply(2, 3));  // Expected: 6
    }

    // Test for multiply function with negative and positive numbers
    @Test
    void testMultiplyNegativeAndPositiveNumbers() {
        Assertions.assertEquals(-6, multiply(-2, 3));  // Expected: -6
    }

    // Test for multiply function with multiple numbers
    @Test
    void testMultiplyMultipleNumbers() {
        Assertions.assertEquals(120, multiply(1, 2, 3, 4, 5));  // Expected: 120
    }

    // Method to add multiple integers
    public static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method to multiply multiple integers
    public static int multiply(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}
