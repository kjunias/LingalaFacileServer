package com.kjunias.LingalaFacileServer.test.rest.controller.fixture;

import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.domain.Definition;
import com.kjunias.LingalaFacileServer.core.domain.TypeImpl;
import com.kjunias.LingalaFacileServer.core.domain.Word;

public class WordRestDataFixture {
	public static final String WORD = "word";
	
	public static Definition standardDefintion() {
		UUID defKey = UUID.randomUUID();
		return new Definition(defKey, "Test Definition: " + defKey.toString());
	}
	
	public static String standardDefinitionJson () {
		return "{\"testWord\" : \"Definition of testWord\"}";
	}
	
	public static Word wordNotFound() {
		return null;
	}
	
	public static Word wordRequested() {
		return new Word("testWord", 
			   new Definition(UUID.randomUUID(),"NewRequestedTestWord Defintion"), 
			   new TypeImpl("NewRequestedTestWordType"));
	}
}