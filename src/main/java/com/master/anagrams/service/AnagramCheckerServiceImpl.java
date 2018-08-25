package com.master.anagrams.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;


/**
 * AnagramCheckerServiceImpl.
 * Created by @author Bogendra Betapudi
 */


@Service
public class AnagramCheckerServiceImpl implements AnagramCheckerService {

	

	@Override
	public String isAnagram(String word1, String word2) {
		if((word1 == null || word2 ==null) ||(word1.length()==0 ||word2.length()==0) ) {
			return "empty words";
		}
		if(word1.length() != word2.length()) {
			return "words are of not same size";
		}
		if (alphabetize(word1).equals(alphabetize(word2))) {
			//System.out.println("yes");
			return "YES";
		} else {
			//System.out.println("No");
			return "NO";
		}

	}

	/**
	 * Core method to take the string and convert it to its corresponding bytes
	 * 
	 */
	
	private String alphabetize(final String word) {
		final byte[] bytes = word.getBytes();
		Arrays.sort(bytes);
		return new String(bytes);
	}
	

}
