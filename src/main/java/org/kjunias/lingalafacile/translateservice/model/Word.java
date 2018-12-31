package org.kjunias.lingalafacile.translateservice.model;

import java.util.HashMap;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Word {

	private String language;
	@PrimaryKey
	private String word;

	private HashMap<String, String> translations;

	public Word(String language, String word) {
		super();
		this.language = language;
		this.word = word;
		this.translations = new HashMap<String, String>();
	}

	public Word() {
		super();
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public HashMap<String, String> getTranslations() {
		return translations;
	}

	public void setTranslations(HashMap<String, String> translations) {
		this.translations = translations;
	}

}
