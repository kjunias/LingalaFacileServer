package org.kjunias.lingalafacile.translateservice.service;

import org.kjunias.lingalafacile.translateservice.model.Word;
import org.kjunias.lingalafacile.translateservice.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslateService {

	@Autowired
	private WordRepository repository;

	public Word translateWord(String word) {
		return this.repository.findById(word).get();
	}
}
