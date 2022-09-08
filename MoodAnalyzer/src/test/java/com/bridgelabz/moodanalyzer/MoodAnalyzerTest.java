package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void messageSad_returnSad(){
        String result = MoodAnalyzer.analyzeMood("I am in sad mood");
        System.out.println(result);
        Assertions.assertEquals("SAD" , result);
    }
}