package com.kjunias.LingalaFacileServer.core.services;

import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.domain.Definition;
import com.kjunias.LingalaFacileServer.core.domain.TypeImpl;
import com.kjunias.LingalaFacileServer.core.domain.Word;

public class WordServiceImpl implements WordService {
	@Override
	public Word requestWord(String requestedWord) {
		Definition defintion = new Definition(UUID.randomUUID(), new TypeImpl("NewWordType"), "New word definition");
		return new Word(requestedWord, defintion);
	}
}
