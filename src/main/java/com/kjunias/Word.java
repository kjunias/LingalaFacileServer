package com.kjunias;

public class Word {

    private final String word;
    private final String definition;

    public Word(String word, String content) {
        this.word = word;
        this.definition = content;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }
}