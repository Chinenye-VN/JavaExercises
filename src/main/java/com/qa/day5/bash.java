package com.qa.day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bash {

    public static char[] bashForward = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static char[] finChars;

    public static void getCharacters(String word) {
        char[] chars = word.toCharArray();
        System.out.println(chars);
        finChars = chars;
        for (char str : chars) {
            for (int i = 0; i < bashForward.length; i++) {
                if (bashForward[i] == str) {
                    System.out.print(bashForward[25 - i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = scan.nextLine();
        getCharacters(word);

    }

}