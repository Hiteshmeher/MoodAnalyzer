package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class MoodAnalyzerTest {
        @Test
        void givenMood_IsSad_ShouldReturn_Sad() throws MoodAnalyzerException {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
            Assertions.assertEquals("Sad", moodAnalyser.AnalyzeMood());
        }

        @Test
        void givenMood_IsHappy_ShouldReturn_Happy() throws MoodAnalyzerException {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
            Assertions.assertEquals("Happy", moodAnalyser.AnalyzeMood());
        }

        @Test
        public void givenMood_NUll_ShouldThrow_MoodAnalysisNullException(){
            MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
            try {
                moodAnalyser.AnalyzeMood();
            } catch (MoodAnalyzerException e) {
                Assertions.assertEquals(MoodAnalyzerException.ExceptionType.Entered_Null, e.Type);
            }
        }

        @Test
        void givenMood_Empty_ShouldThrow_MoodAnalysisEmptyException() {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
            try {
                moodAnalyser.AnalyzeMood();
            } catch (MoodAnalyzerException e) {
                Assertions.assertEquals(MoodAnalyzerException.ExceptionType.Entered_Empty, e.Type);
            }
        }
    }