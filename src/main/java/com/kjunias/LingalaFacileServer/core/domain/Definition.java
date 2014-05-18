package com.kjunias.LingalaFacileServer.core.domain;

public class Definition {
	Type wordType;
	
	String definition;

	public Definition(String definition) {
		super();
		this.definition = definition;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public Type getWordType() {
		return wordType;
	}

	public void setWordType(Type wordType) {
		this.wordType = wordType;
	}
}
