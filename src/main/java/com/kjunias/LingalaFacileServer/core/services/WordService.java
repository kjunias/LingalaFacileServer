package com.kjunias.LingalaFacileServer.core.services;

import com.kjunias.LingalaFacileServer.core.events.words.RequestWordEvent;
import com.kjunias.LingalaFacileServer.core.events.words.WordRequestedEvent;

public interface WordService {
	public WordRequestedEvent requestWord(RequestWordEvent requestWord);
}
