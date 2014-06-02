package com.kjunias.LingalaFacileServer.core.services;

import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.domain.Definition;
import com.kjunias.LingalaFacileServer.core.domain.TypeImpl;
import com.kjunias.LingalaFacileServer.core.domain.Word;

public class WordServiceImpl implements WordService {
	@Override
	public Word requestWord(String requestedWord) {
		Definition requestedWordDefintion = new Definition(UUID.randomUUID(), "New word definition");
		TypeImpl type = new TypeImpl("NewWordType");
		return new Word(requestedWord, requestedWordDefintion, type);
	}
}
