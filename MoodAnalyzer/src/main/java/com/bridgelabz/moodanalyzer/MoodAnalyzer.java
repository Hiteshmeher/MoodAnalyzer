package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String message;

    public MoodAnalyzer(String message){
    this.message = message;
    }
    public String AnalyzeMood() throws MoodAnalyzerException{
        try {
            if (message.length() == 0){
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.Entered_Empty,"Enter a message");
            }
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.Entered_Null,"Invalid mood");
        }

    }
}