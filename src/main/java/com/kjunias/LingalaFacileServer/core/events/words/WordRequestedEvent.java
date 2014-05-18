package com.kjunias.LingalaFacileServer.core.events.words;

import java.util.UUID;

public class WordRequestedEvent {
	private UUID key;
	private boolean entityFound;
	
	public WordRequestedEvent(UUID key) {
		this.key = key;
	}

	public static WordRequestedEvent notFound(UUID key) {
		WordRequestedEvent ev = new WordRequestedEvent(key);
		ev.entityFound = false;
		return ev;
	}
}
