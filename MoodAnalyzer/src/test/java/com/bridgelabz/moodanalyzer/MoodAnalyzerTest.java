package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    // Test case for return SAD if message contains sad
    void messageSad_returnSad(){
        String result = MoodAnalyzer.analyzeMood("I am in sad mood");
        System.out.println(result);
        Assertions.assertEquals("SAD" , result);
    }
    @Test
    // Test case for Return Happy if message doesnot contain sad
    void messageAnyThing_ReturnHappy(){
        String result = MoodAnalyzer.analyzeMood("I am in Any Mood");
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
}