package com.kjunias.lingalafacileserver.core.events.words;

import java.util.UUID;

public class WordDetailsEvent {
	private UUID key;

	public WordDetailsEvent(UUID key) {
		super();
		this.key = key;
	}

	public UUID getKey() {
		return key;
	}

	public void setKey(UUID key) {
		this.key = key;
	}
}
