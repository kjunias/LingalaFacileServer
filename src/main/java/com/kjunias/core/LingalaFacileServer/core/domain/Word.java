package com.kjunias.core.LingalaFacileServer.core.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Word {
	UUID wordKey;
	
	String word;
	
	List <Definition> defintions = new ArrayList<Definition>();
	Type type;
	
	public Word(String word, List <Definition> defintions, Type type) {
		super();
		this.word = word;
		this.defintions = defintions;
		this.type = type;
	}
	
	public Word(String word, Definition defintion, Type type) {
		super();
		this.word = word;
		this.defintions.add(defintion);
		this.type = type;
	}
	
	public void addDefinition (Definition definition) {
		this.defintions.add(definition);
	}
	
	public void removeDefinition (Definition definition) {
		this.defintions.remove(definition);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Type getType() {
		return type;
	}

	public String getStringType() {
		return this.type.getType();
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public List<Definition> getDefintions() {
		return defintions;
	}

	public void setDefintions(List<Definition> defintions) {
		this.defintions = defintions;
	}

	public UUID getWordKey() {
		return wordKey;
	}

	public void setWordKey(UUID wordKey) {
		this.wordKey = wordKey;
	}	
	
}