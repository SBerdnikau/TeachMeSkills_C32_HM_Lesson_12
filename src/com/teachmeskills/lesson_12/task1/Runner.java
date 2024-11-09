package com.teachmeskills.lesson_12.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задача 1
 * Написать программу, что переданная строка это hex code для описания цвета.
 * Например, при вводе в программу значения #8b2323, программа должна вернуть - Yes.
 */
public class Runner {
    public static void main(String[] args) {
        String hexCodeColor = "#8b2323";
        colorDescription(hexCodeColor);
    }

    public static void colorDescription(String inputData){
        String regexp = "^(#)([0-9a-fA-F]{6})$";
        Pattern pattern =  Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(inputData);
        System.out.println(matcher.find() ? "Yes" : "No" );
    }
}
