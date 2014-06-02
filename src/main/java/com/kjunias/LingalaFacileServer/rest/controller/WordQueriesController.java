package com.kjunias.LingalaFacileServer.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kjunias.LingalaFacileServer.core.domain.Word;
import com.kjunias.LingalaFacileServer.core.services.WordServiceImpl;

@Controller
@RequestMapping("/words/{word}")
public class WordQueriesController {
	private Logger LOG = LoggerFactory.getLogger(WordQueriesController.class);
	@Autowired
	private WordServiceImpl wordService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{word}")
    public ResponseEntity <Word> viewWord (@PathVariable String word) {
		Word requestedWord = this.wordService.requestWord(word);
		
		if(requestedWord == null) {
			LOG.debug("Requested word not found");
			return new ResponseEntity<Word>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity <Word> (HttpStatus.OK);
	}
}
