package com.kjunias.LingalaFacileServer.core.events.words;

import java.util.UUID;

public class RequestWordEvent {
	private UUID key;
	private boolean entityFound;
	
	
	public RequestWordEvent(UUID key) {
		this.key = key;
	}

	public RequestWordEvent(String word) {
		this.key = UUID.fromString(word);
	}

	public static RequestWordEvent wordNotFound(UUID key) {
		RequestWordEvent ev = new RequestWordEvent(key);
		ev.entityFound = false;
		return ev;
	}

	public UUID getKey() {
		return key;
	}

	public void setKey(UUID key) {
		this.key = key;
	}

	public boolean isEntityFound() {
		return entityFound;
	}

	public void setEntityFound(boolean entityFound) {
		this.entityFound = entityFound;
	}
}