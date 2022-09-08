package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public static String analyzeMood(String message){
        if (message.contains("sad"))
            return "SAD";
        else if (message.contains("happy"))
            return "HAPPY";
        else
            return null;
    }
    public static void main(String[] args) {
       MoodAnalyzer mood = new MoodAnalyzer();
       System.out.println(mood.analyzeMood("i am in sad mood"));
       System.out.println(mood.analyzeMood("i am in happy mood"));
    }
}