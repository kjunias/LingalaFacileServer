package com.kjunias.lingalafacileserver.rest.controller.fixture;

import java.util.UUID;

import com.kjunias.lingalafacileserver.core.events.words.WordDetailsEvent;

public class RestEventFixture {

	  public static WordDetailsEvent wordDetailsNotFound(UUID key) {
	    return WordDetailsEvent.notFound(key);
	  }

}
