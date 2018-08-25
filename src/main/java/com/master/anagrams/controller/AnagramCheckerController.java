package com.master.anagrams.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.master.anagrams.service.AnagramCheckerServiceImpl;

/**
 * AnagramCheckerController.
 * Created by @author Bogendra Betapudi
 */


@Controller
public class AnagramCheckerController {

	private static final Logger logger = LoggerFactory.getLogger(AnagramCheckerController.class);

	@Autowired
	private AnagramCheckerServiceImpl checker;

	@RequestMapping(value = "/anagrams", method = RequestMethod.GET)
	@ResponseBody
	public String anagramChecker(@RequestParam("word1") String word1, @RequestParam("word2") String word2)  {
		logger.info("the words:"+ word1+""+word2);
		return checker.isAnagram(word1, word2);

	}

}
