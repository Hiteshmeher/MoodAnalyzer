package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String message;
    //constructor
    public MoodAnalyzer(String message){
        this.message = message;
        analyzeMood();
    }
    public String analyzeMood(){
        if (message.contains("sad"))
            // if message contains sad it will return sad
            return "SAD";
        else // if message will not contain sad then it will return Happy
            return "HAPPY";
    }
}