package com.kjunias.LingalaFacileServer.core.domain;

import java.util.ArrayList;
import java.util.List;

public class Word {
	String word;
	
	List <Definition> definitions = new ArrayList<Definition>();
	
	public Word(String word, List <Definition> defintions, Type type) {
		super();
		this.word = word;
		this.definitions = defintions;
	}
	
	public Word(String word, Definition defintion) {
		super();
		this.word = word;
		this.definitions.add(defintion);
	}
	
	public void addDefinition (Definition definition) {
		this.definitions.add(definition);
	}
	
	public void removeDefinition (Definition definition) {
		this.definitions.remove(definition);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public List<Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<Definition> defintions) {
		this.definitions = defintions;
	}
}