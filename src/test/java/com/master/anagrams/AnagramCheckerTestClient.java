package com.master.anagrams;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class AnagramCheckerTestClient {

	RestTemplate restTemplate  = new RestTemplate();
	@Test
	public  void testIsAnagramEqualsNO()
	{
	    final String uri = "http://localhost:8080/anagrams?word1=cinema&word2=iCeman";
	     
	   
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    //System.out.println(result);
	    assertEquals(result,"NO");
	}
	@Test
	public  void testIsAnagramEqualsYES()
	{
	    final String uri = "http://localhost:8080/anagrams?word1=cinema&word2=iceman";
	     
	   
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    //System.out.println(result);
	    assertEquals(result,"YES");
	}
	
	@Test
	public  void testIsAnagramForDifferentLengths()
	{
	    final String uri = "http://localhost:8080/anagrams?word1=cinema&word2=ieman";
	     
	   
	    String result = restTemplate.getForObject(uri, String.class);
	     
	   // System.out.println(result);
	    assertEquals(result,"words are of not same size");
	}
	
}
