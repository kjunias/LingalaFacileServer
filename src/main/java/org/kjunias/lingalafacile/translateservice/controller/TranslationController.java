package org.kjunias.lingalafacile.translateservice.controller;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.kjunias.lingalafacile.translateservice.repository.WordRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

	private final WordRepository repository;

	TranslationController(WordRepository repository) {
		this.repository = repository;
	}
	// Single item
	@GetMapping("/translate/{word}")
	Word one(@PathVariable String word) {
		return repository.findById(word).get();
	}

}
