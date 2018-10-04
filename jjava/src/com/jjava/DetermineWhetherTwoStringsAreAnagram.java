package com.jjava;

import java.util.Arrays;

public class DetermineWhetherTwoStringsAreAnagram 
{
	public static void main(String[]args) 
	{
		//declaring two variable to store string
		
		String str = "Grab";
		String str1 = "Brag";
		
		//compare the length of the string
		Boolean res = str.length() == str1.length();
		
		System.out.println("length of two Strings are equal " + res);
		
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		
		//converting both arrays to char array
		char[] string1 = str.toCharArray();
		
		
		char[] string2 = str.toCharArray();
		
		//Sorting the arrays using in-built function  sort()
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		//comparing both the arrays using in-built function equals()
		if(Arrays.equals(string1,string2) == true)
		{
			System.out.println("Both the strings are anagram");
			
		}
		else
		{
			System.out.println("Both strings are not anagram");
		}
		
		
		
	}
	

}
