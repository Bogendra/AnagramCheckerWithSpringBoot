package com.master.anagrams.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * AnagramException.
 * Created by @author Bogendra Betapudi
 */

public class AnagramException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
		private ResponseEntity<String> httpStatus;
		private String errorMessage;
	    
	   public AnagramException(String message) {
		   this.errorMessage = message;
		   ResponseEntity.status(HttpStatus.BAD_REQUEST);
	   }
	   
	   public ResponseEntity<String> getHttpStatus() {
			return httpStatus;
		}
	   
	   public String getErrorMessage() {
			return errorMessage;
		}

		

		
}
