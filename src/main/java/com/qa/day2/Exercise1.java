package com.qa.day2;

public class Exercise1 {

    public static void main(String[] args) {
        addingIntegers(4,2);
        subtractIntegers(4,2);
        multiplyIntegers(4,2);
        divideIntegers(3,4);
    }


    public static int addingIntegers (int num1 , int num2) {

        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public static int subtractIntegers (int num1 , int num2) {

        int result = num1 - num2;
        System.out.println(result);
        return result;
    }
    public static int multiplyIntegers (int num1 , int num2) {

        int result = num1 * num2;
        System.out.println(result);
        return result;
    }

    public static double divideIntegers (int num1 , int num2) {
        if (num1 < num2) {
            double result = num1 / num2;
            System.out.println(result);
            return result;
        }
        else {
            System.out.println("Cannot execute");
            return 0;
        }

    }
}
