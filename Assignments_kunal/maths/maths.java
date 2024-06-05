package Assignments_kunal.maths;

// given a number is find the number is odd or even using bitwise.

import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
       int n = 2;
        System.out.println(odd(n));

    }
    static boolean odd(int n) {
        return (n & 1) == 0;
    }
}
