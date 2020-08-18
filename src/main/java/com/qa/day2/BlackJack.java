package com.qa.day2;

public class BlackJack {
    public static void main(String[] args) {
        blackjack(18,20);

    }
    public static int blackjack (int a, int b) {
        if (a > b && a < 21) {
            System.out.println(a);
            return a;
        } else if (b > a && b < 21) {
            System.out.println(b);
            return b;
        } else {
            System.out.println(0);
            return 0;
        }
    }
}
