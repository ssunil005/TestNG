package com.jjava;

public class CountVowelConsonant {
	public static void main(String[] args) {
		
		//counter to store variable & consonant
		int vowelCount = 0, consonantCount = 0;
		
		//Declaring a string
		String str = "This is a very simple sentence";
		
		//converting the entire sting to lower case to reduce the comparisons
		str = str.toLowerCase();
		
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowelCount++;
			}
			
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				consonantCount++;
			}
			
		}
		System.out.println("count of vowel is  : " + vowelCount);
		System.out.print("count of consonant is : " + consonantCount);
	}

}
