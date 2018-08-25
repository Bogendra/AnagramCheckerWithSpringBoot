package com.master.anagrams.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * AnagramExceptionHandler.
 * Created by @author Bogendra Betapudi
 */


@ControllerAdvice
public class AnagramExceptionHandler {

	private static Logger LOGGER = LoggerFactory.getLogger(AnagramExceptionHandler.class);

	@ExceptionHandler(AnagramException.class)
	protected ResponseEntity<String> handleAnagramException(AnagramException ex) {
		LOGGER.error("AnagramException ", ex);
		LOGGER.warn("AnagramException", ex.getMessage());
		LOGGER.info("AnagramException", ex.getHttpStatus());
		return ex.getHttpStatus();

	}

}
