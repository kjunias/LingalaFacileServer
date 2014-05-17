package com.kjunias.word.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Word implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private String word;
    private Definition definition;
    
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

    public void setWord(String word) {
		this.word = word;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

	public Definition getDefinition() {
		return definition;
	}

	public ArrayList <String> getDefinitions() {
        return definition.getDefinitions();
    }
}