package com.qa.day4;

public class factorials {
    public static void main(String[] args) {
        factorial(24);
    }
    public static void factorial(int num1) {
        int i = 1;
        while (num1 > 1) {
            i++;
            num1 = (num1 / i);
        }

        if (num1 % i != 0) {
            System.out.println(i++);

        } else {
            System.out.println("It is not a factorial");
        }

    }

}

