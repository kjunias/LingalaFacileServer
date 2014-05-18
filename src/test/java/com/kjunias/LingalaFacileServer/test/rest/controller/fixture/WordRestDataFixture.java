package com.kjunias.LingalaFacileServer.test.rest.controller.fixture;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.domain.Definition;
import com.kjunias.LingalaFacileServer.core.events.words.AllDefinitionsEvent;

public class WordRestDataFixture {
	public static final String WORD = "word";
	
	public static AllDefinitionsEvent allDefinitions() {
		List <Definition> definitions = new ArrayList <Definition> ();
		definitions.add(standardDefintion());
		definitions.add(standardDefintion());
		definitions.add(standardDefintion());
		
		return new AllDefinitionsEvent(definitions);
	}

	public static Definition standardDefintion() {
		UUID defKey = UUID.randomUUID();
		return new Definition(defKey, "Test Definition: " + defKey.toString());
	}
	
	public static String standardDefinitionJson () {
		return "\"testkey\" : \"Definition of test key\"";
	}
}