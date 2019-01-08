package org.kjunias.lingalafacile.translateservice.controller;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.kjunias.lingalafacile.translateservice.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController {
	
	@Autowired
	private TranslateService translateService;

	@CrossOrigin
	@GetMapping("/translate/{word}")
	Word one(@PathVariable String word) {
		return translateService.translateWord(word);
	}
}
