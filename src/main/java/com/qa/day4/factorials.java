package com.qa.day4;

public class factorials {
    public static void main(String[] args) {
        System.out.println(factorial(60));

    }

    public static int factorial(int num1) {
        int i = 1;
        while (num1 > 1) {
            num1 = (num1 / i);
            i++;
        }
        return i-1;


    }
}
