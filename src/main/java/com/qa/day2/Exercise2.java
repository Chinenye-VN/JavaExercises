package com.qa.day2;

public class Exercise2 {

    public static int Physics;
    public static int Chemistry;
    public static int Biology;
    public static int TotalScore;
    public static int Average;
    public static int Percentage;

    public static void main(String[] args) {

        addingSubjectScores(50,100,120);
        calcPercentageAverage(50,100,120);
        if(calcPercentageAverage(50,100,120) < 60) {
            System.out.println("You need 60% on all your subjects to pass");
        } if(calcPercentageAverage(100,59,140)< 60){
            System.out.println("You need 60% on all your subjects to pass");
        } if (calcPercentageAverage(80,100,55)< 60) {
            System.out.println("You need 60% on all your subjects to pass");
        } else {
            System.out.println("Well done you've passed all your subjects");
        }


    }

    public static int addingSubjectScores (int Physics, int Chemistry, int Biology) {

        int TotalScore = Physics + Chemistry + Biology;
        System.out.println(TotalScore);
        return TotalScore;

    }
    public static double calcPercentageAverage (double Physics, double Chemistry, double Biology) {
        double Average = ((Physics + Chemistry + Biology) / 450);
        System.out.println(Average);
        double Percentage = ((Physics + Chemistry + Biology) / 450) * 100;
        System.out.println(Percentage);
        return Percentage;
    }

}
