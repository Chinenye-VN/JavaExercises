package com.qa.day4;

public class calculator {

    public static void main(String[] args) {
        calc(9,3,1,7);
    }

        public static void calc(double a, double b, double c, double d) {
            if ((a+b)*c==d){
                System.out.println(a + "+" + b + "*" + c + "="+d);
            }
            if ((a-b)*c==d){
                System.out.println(a + "-" + b + "*" + c + "="+d);
            }
            if ((a/b)*c==d){
                System.out.println(a + "/" + b + "*" + c + "="+d);
            }
            if ((a*b)*c==d){
                System.out.println(a + "+" + b + "*" + c + "="+d);
            }

            if ((a+b)/c==d){
                System.out.println(a + "+" + b + "/" + c + "="+d);
            }
            if ((a-b)/c==d){
                System.out.println(a + "-" + b + "/" + c + "="+d);
            }
            if ((a/b)/c==d){
                System.out.println(a + "/" + b + "/" + c + "="+d);
            }
            if ((a*b)/c==d){
                System.out.println(a + "*" + b + "/" + c + "="+d);
            }

            if ((a+b)+c==d){
                System.out.println(a + "+" + b + "+" + c + "="+d);
            }
            if ((a-b)+c==d){
                System.out.println(a + "-" + b + "+" + c + "="+d);
            }
            if ((a/b)+c==d){
                System.out.println(a + "/" + b + "+" + c + "="+d);
            }
            if ((a*b)+c==d){
                System.out.println(a + "*" + b + "+" + c + "="+d);
            }

            if ((a+b)-c==d){
                System.out.println(a + "+" + b + "-" + c + "="+d);
            }
            if ((a-b)-c==d){
                System.out.println(a + "-" + b + "-" + c + "="+d);
            }
            if ((a/b)-c==d){
                System.out.println(a + "/" + b + "-" + c + "="+d);
            }
            if ((a*b)-c==d){
                System.out.println(a + "*" + b + "-" + c + "="+d);
            }

        }
    }

