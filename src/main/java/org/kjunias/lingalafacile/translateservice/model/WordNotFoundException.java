package org.kjunias.lingalafacile.translateservice.model;

public class WordNotFoundException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WordNotFoundException() {
		super("Could not find word");
	}
	
}
