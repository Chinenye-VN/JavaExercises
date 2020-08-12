package com.qa.day2;

import javax.swing.*;

import static com.qa.day2.Conditionals1.method1;

public class Conditionals1 {

    public static void main(String[] args) {
        method1(1,2, true);
    }

    public static int method1 (int a, int b, boolean check) {
        if (check){
            System.out.println(a+b);
        } else {
            System.out.println(a*b);
        }
    }
}
