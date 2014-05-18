package com.kjunias.LingalaFacileServer.core.domain;

import java.util.UUID;

public class Definition {
	UUID defKey;
	Type wordType;
	String definition;

	public Definition(UUID key, String definition) {
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
