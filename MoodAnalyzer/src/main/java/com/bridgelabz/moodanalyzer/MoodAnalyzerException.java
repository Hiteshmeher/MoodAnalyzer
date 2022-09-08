package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerException extends Exception {
    enum ExceptionType{
        Entered_Null, Entered_Empty;
    }
    ExceptionType Type;
    public MoodAnalyzerException(ExceptionType Type, String message){
        super(message);
        this.Type = Type;
    }
}