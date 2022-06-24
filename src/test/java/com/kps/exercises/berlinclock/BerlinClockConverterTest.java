package com.kps.exercises.berlinclock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinClockConverterTest 
{
	private BerlinClockConverter berlinClockConverter = new BerlinClockConverter();

	@Test
	public void testTime000000() {
		// When
		final String convertedStr = berlinClockConverter.convert("00:00:00");
		
		// Then
		final String expectedStr = "Y\n" +
		                           "OOOO\n" + 
				                   "OOOO\n" + 
		                           "OOOOOOOOOOO\n" +
				                   "OOOO\n"; 
		assertEquals(expectedStr, convertedStr);
	}

	@Test
	public void testTime131701() {
		// When
		final String convertedStr = berlinClockConverter.convert("13:17:01");
		
		// Then
		final String expectedStr = "O\n" +
		                           "RROO\n" + 
				                   "RRRO\n" + 
		                           "YYROOOOOOOO\n" + 
				                   "YYOO\n"; 
		assertEquals(expectedStr, convertedStr);
	}

	@Test
	public void testTime032802() {
		// When
		final String convertedStr = berlinClockConverter.convert("03:28:02");
		
		// Then
		final String expectedStr = "Y\n" +
		                           "OOOO\n" +
				                   "RRRO\n" +
		                           "YYRYYOOOOOO\n" +
				                   "YYYO\n"; 
		assertEquals(expectedStr, convertedStr);
	}

	@Test
	public void testTime235959() {
		// When
		final String convertedStr = berlinClockConverter.convert("23:59:59");
		
		// Then
		final String expectedStr = "O\n" + 
		                           "RRRR\n" +
				                   "RRRO\n" + 
		                           "YYRYYRYYRYY\n" + 
				                   "YYYY\n"; 
		assertEquals(expectedStr, convertedStr);
		
	}
}
