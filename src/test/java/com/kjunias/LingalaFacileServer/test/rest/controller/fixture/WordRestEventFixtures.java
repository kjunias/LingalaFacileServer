package com.kjunias.LingalaFacileServer.test.rest.controller.fixture;

import static com.kjunias.LingalaFacileServer.test.rest.controller.fixture.RestDataFixture.customKeyOrderDetails;

import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.events.orders.OrderCreatedEvent;
import com.kjunias.LingalaFacileServer.core.events.orders.OrderDetailsEvent;
import com.kjunias.LingalaFacileServer.core.events.words.WordDefinitionsEvent;
import com.kjunias.LingalaFacileServer.core.events.words.WordRequestedEvent;

public class WordRestEventFixtures {

	public static WordRequestedEvent wordRequestedNotFound(UUID key) {
		return WordRequestedEvent.notFound(key);
	}
	
	public static WordDefinitionsEvent wordDefinitionNotFound(UUID key) {
		return WordDefinitionsEvent.notFound(key);
	}
}
