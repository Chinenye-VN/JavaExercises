package com.qa.day2;

public class Conditional2 {

    public static int A = 5000;
    public static void main(String[] args) {
        if(A>2000) {
            System.out.println(1);
            if(A>100) {
                System.out.println(2);
            }else {
                System.out.println(3);
            }
        }else{
            System.out.println(A);
        }if(A>6000) {
            System.out.println("C");
        }else{
            System.out.println("B");
        }if(A>4000) {
            System.out.println("D");
        }else{
            System.out.println("E");
        }
    }

}
