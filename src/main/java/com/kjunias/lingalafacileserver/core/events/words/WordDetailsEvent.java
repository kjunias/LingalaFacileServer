package com.kjunias.lingalafacileserver.core.events.words;

import java.util.UUID;

import com.kjunias.lingalafacileserver.core.events.ReadEvent;

public class WordDetailsEvent extends ReadEvent {
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

	public static WordDetailsEvent notFound(UUID key) {
		WordDetailsEvent ev = new WordDetailsEvent(key);
		ev.entityFound = false;
		return ev;
	}
}