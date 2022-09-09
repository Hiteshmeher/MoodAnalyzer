package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String message;
    //constructor
    public MoodAnalyzer(String message){
        this.message = message;
        analyzeMood();
    }
    public String analyzeMood(){
        try {
            if (message.contains("sad"))
                // if message contains sad it will return sad
                return "SAD";
            else if (message.contains("happy"))
                // if message will not contain sad then it will return Happy
                return "HAPPY";
        }
        catch (NullPointerException e){
            System.out.println("Enter Valid Mood");
        }
        return " ";
    }
}