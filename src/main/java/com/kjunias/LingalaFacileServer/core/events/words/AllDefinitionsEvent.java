package com.kjunias.LingalaFacileServer.core.events.words;

import java.util.List;

import com.kjunias.LingalaFacileServer.core.domain.Definition;

public class AllDefinitionsEvent {
	List <Definition> definitions;
	
	public AllDefinitionsEvent(List<Definition> definitions) {
		this.definitions = definitions;
	}

}
