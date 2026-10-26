package com.algorithmicjourney.practice;

public class Factorial {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // System.out.println(factorial(5));
        System.out.println(factorialIterative(5));
    }

    // using iteration
    public static int factorialIterative(int n) {
       int res = 1;

       while( n > 1){
            res = res * n;
            n --;
       }
       return res;
    }
}
