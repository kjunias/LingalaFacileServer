package com.kjunias.LingalaFacileServer.test.rest.controller.fixture;

import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.events.words.WordDefinitionsEvent;
import com.kjunias.LingalaFacileServer.core.events.words.WordRequestedEvent;

public class WordRestEventFixtures {

	public static WordRequestedEvent wordRequestedNotFound(UUID key) {
		return WordRequestedEvent.wordNotFound(key);
	}
	
	public static WordDefinitionsEvent wordDefinitionNotFound(UUID key) {
		return WordDefinitionsEvent.notFound(key);
	}
}
