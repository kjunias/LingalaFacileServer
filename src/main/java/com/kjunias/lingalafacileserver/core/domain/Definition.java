package com.kjunias.lingalafacileserver.core.domain;

import java.util.ArrayList;

public class Definition{
	ArrayList <String> definitions;
	
	public Definition(String definition){
		this.definitions = new ArrayList<String>();
		this.definitions.add(0, definition);
	}
	
	public ArrayList<String> getDefinitions () {
		return this.definitions;
	}
	
	public void addDefinition (String definition) {
		this.definitions.add(definition);
	}
}