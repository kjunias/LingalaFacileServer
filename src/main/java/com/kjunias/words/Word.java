package com.kjunias.words;

import java.util.ArrayList;

public class Word {

    private final String word;
    private final Definition definition;
    
    public Word(String word, String content) {
        this(word, content, word);
    }
    
    public Word(String word, String definition, String synonym) {
        this.word = word;
        this.definition = new Definition(definition);
        this.definition.getDefinitions();
    }

    public String getWord() {
        return word;
    }

    public ArrayList <String> getDefinitions() {
        return definition.getDefinitions();
    }
}