package com.qa.day2;

public class BlackJack {
    public static void main(String[] args) {
        blackjack(10,300);

    }
    public static int blackjack (int a, int b) {
        if (a > b && a <= 21 && b <= 21) {
            System.out.println(a);
            return a;
        } else if (a > b && a > 21 && b < 21){

            System.out.println(b);
            return b;
        } else if (b > a && b <= 21 && a <= 21) {

            System.out.println(b);
            return b;
        }else if (b > a && b > 21 && a < 21){

            System.out.println(a);
            return a;
        } else {
            System.out.println(0);
            return 0;
        }
    }
}
