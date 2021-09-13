package com.example.api.services;

import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ReverserService {

    private List<String> randomSentences;

    public ReverserService() {
        this.randomSentences = new ArrayList<>();
        randomSentences.add("Arrgh.");
        randomSentences.add("Uhmm.");
        randomSentences.add("Err..err.");
        randomSentences.add("err.");
        randomSentences.add("Ehm.");
        randomSentences.add("Uff..uff.");
        randomSentences.add("Ohm.");
    }

    public List<String> breakToSentences(String text) {
        List<String> sentences = new ArrayList<>();

        BreakIterator iterator = BreakIterator.getSentenceInstance();
        iterator.setText(text);
        int start = iterator.first();

        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            sentences.add(text.substring(start, end));
        }

        return sentences;
    }

    public String rest(String text) {

        String temporarySentence = "";
        String temporaryString = "";
        String firstWord = "";

        StringBuilder stringBuilder = new StringBuilder();
        String[] newArray = new String[100];

        for (int i = 0; i < breakToSentences(text).size(); i++) {

            int originalPosition = i;
            int newPosition = originalPosition + i;

            for (String sentence : breakToSentences(text)) {
                temporarySentence = sentence;
                String[] wordsArray = temporarySentence.split(" ");
                String temporary = wordsArray[originalPosition];
                newArray[newPosition] = temporary;
            }
        }
        return stringBuilder.toString();
    }

}
