package com.qa.day3;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Arrays {

    public static int[] objects = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {




        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.forEach(n -> System.out.println(n));
        arrayList.forEach(n -> {if (n % 2 == 0) System.out.println(n);});



    }
}
