package com.teachmeskills.lesson_12.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задача 2
 * Написать программу, которая будет проверять, что введенная ссылка валидная.
 * Например, при анализе вот такой ссылки https://teachmeskills.by/kursy/programmirovaniya-online
 * - программа должна вернуть, что ссылка валидна.
 * А при вводе tcp://teachmeskills.by/kursy/programmirovaniya-online
 * - программа должна вернуть, что ссылка не валидна (ссылка начинается ни с http, ни с https)
 */
public class Runner {
    public static void main(String[] args) {
        String[] webResources = {
                "https://teachmeskills.by/kursy/programmirovaniya-online",
                "tcp://teachmeskills.by/kursy/programmirovaniya-online"
        };
        webResourcedDescriptor(webResources);
    }

    public static void webResourcedDescriptor(String[] resources){
        String regexp = "^(https|http)://";
        Pattern pattern = Pattern.compile(regexp);
        for (String link : resources){
            Matcher matcher = pattern.matcher(link);
            System.out.println(matcher.find() ? "The link is valid" : "The link starts with neither http nor https" );
        }
    }
}
