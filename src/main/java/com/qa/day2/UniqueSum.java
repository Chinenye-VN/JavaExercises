package com.qa.day2;

public class UniqueSum {
    public static void main(String[] args) {
        uniquesum(2,2,1);

    }
    public static int uniquesum (int a,int b, int c) {
        if(a == b && a==c) {
            System.out.println(0);
            return 0;
        }else if(b==c && b!=a) {
            System.out.println(a+b);
            return a+b;

        }else if (a==c && a!=b) {
            System.out.println(a+b);
            return a+b;

        } else if (a ==b && a != c) {
            System.out.println(a+c);
            return a+c;
        }else {
            System.out.println(a+b+c);
            return a+b+c;
        }
    }
}
