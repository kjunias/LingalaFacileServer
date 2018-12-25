package org.kjunias.lingalafacile.translateservice.translate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TranslationNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(TranslationNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(TranslationNotFoundException ex) {
		return ex.getMessage();
	}
}