package org.kjunias.lingalafacile.translateservice.translate;

public class TranslationNotFoundException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TranslationNotFoundException() {
		super("Could not find word");
	}
	
}
