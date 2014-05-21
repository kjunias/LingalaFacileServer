package com.kjunias.LingalaFacileServer.core.events.words;

import java.util.List;

import com.kjunias.LingalaFacileServer.core.domain.Definition;

public class RequestAllDefinitionsEvent {
	List <Definition> definitions;
	
	public RequestAllDefinitionsEvent(List<Definition> definitions) {
		this.definitions = definitions;
	}

}
