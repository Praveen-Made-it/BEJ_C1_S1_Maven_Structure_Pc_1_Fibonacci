/*
 *Author Name:Praveen Kumar
 *Date: 15-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp;

import com.niit.jdp.Fibonacci.Fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FibonacciTest {
    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {

        fibonacci = null;
    }

    //Test case for correct Series
    @Test
    void checkSuccessFibonacci() {
        int fibonacciSeries[] = fibonacci.fibonacci(6);
        int expected[] = {0, 1, 1, 2, 3, 5};
        assertArrayEquals(expected, fibonacciSeries);
    }

    //Test case for incorrect Series
    @Test
    void failureCheckFibonacci() {
        int fibonacciSeries[] = fibonacci.fibonacci(5);
        int expected[] = {0, 1, 3, 2, 3};
        assertNotEquals(expected, fibonacciSeries);
    }
}
