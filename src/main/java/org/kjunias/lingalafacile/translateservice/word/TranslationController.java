package org.kjunias.lingalafacile.translateservice.word;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

	private final WordRepository repository;

	TranslationController(WordRepository repository) {
		this.repository = repository;
	}

	// Aggregate root
	@GetMapping("/translateAll")
	List<Word> all() {
		return repository.findAll();
	}

	// Single item
	@GetMapping("/translate/{word}")
	Word one(@PathVariable String word) {
		return repository.findById(word).get();
	}

}
