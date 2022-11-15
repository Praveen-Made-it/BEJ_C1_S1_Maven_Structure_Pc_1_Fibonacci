/*
 *Author Name:Praveen Kumar
 *Date: 15-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.Fibonacci;

public class Fibonacci {
    public int[] fibonacci(int number) {
        int number1 = 0;
        int number2 = 1;
        int number3;
        int fibonacciSeries[] = new int[number];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 0; i < number - 2; i++) {
            number3 = number1 + number2;
            fibonacciSeries[i + 2] = number3;
            number1 = number2;
            number2 = number3;
        }
        return fibonacciSeries;
    }
}
