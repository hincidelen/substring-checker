package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SubstringCheckerServiceTest {

	@Test
	void testCheckSubstring() {
		assertTrue(SubstringCheckerService.checkSubstring("baba", "abab"));
		assertFalse(SubstringCheckerService.checkSubstring("baba", "abc"));
		assertTrue(SubstringCheckerService.checkSubstring("lds", "loodos"));
	}

}
