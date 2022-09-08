package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    /**
     *
     * @param message
     * @return
     */
    public static String analyzeMood(String message){
        if (message.contains("sad"))
            // if message contains sad it will return sad
            return "SAD";
        else // if message will not contain sad then it will return Happy
            return "HAPPY";
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

       MoodAnalyzer mood = new MoodAnalyzer();
       System.out.println(mood.analyzeMood("i am in sad mood"));
       System.out.println(mood.analyzeMood("i am in happy mood"));
    }
}