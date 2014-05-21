package com.kjunias.LingalaFacileServer.test.rest.controller.fixture;

import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.domain.Definition;

public class WordRestDataFixture {
	public static final String WORD = "word";
	
	public static Definition standardDefintion() {
		UUID defKey = UUID.randomUUID();
		return new Definition(defKey, "Test Definition: " + defKey.toString());
	}
	
	public static String standardDefinitionJson () {
		return "\"testkey\" : \"Definition of test key\"";
	}
}