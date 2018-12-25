package org.kjunias.lingalafacile.translateservice.translate;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

	private final TranslationRepository repository;

	TranslationController(TranslationRepository repository) {
		this.repository = repository;
	}

	// Aggregate root
	@GetMapping("/translateAll")
	List<Translation> all() {
		return repository.findAll();
	}

	// Single item
	@GetMapping("/translate/{word}")
	Translation one(@PathVariable String word) {
		return repository.findById(word).get();
	}

}
