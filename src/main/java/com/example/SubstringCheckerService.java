package com.example;

public class SubstringCheckerService {

	public static boolean checkSubstring(String childStr, String parentStr) {

		for (char ch : childStr.toCharArray()) {
			if (hasChar(parentStr, ch)) {
				parentStr = removeChar(parentStr, parentStr.indexOf(ch));
			} else {
				return false;
			}
		}
		return true;
	}

	private static boolean hasChar(String parentStr, char ch) {
		return parentStr.indexOf(ch) >= 0;
	}

	public static String removeChar(String str, Integer n) {
		String front = str.substring(0, n);
		String back = str.substring(n + 1, str.length());
		return front + back;
	}
}
