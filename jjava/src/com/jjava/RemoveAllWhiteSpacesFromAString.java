package com.jjava;

public class RemoveAllWhiteSpacesFromAString 
{
	public static void main(String[] args)
	{
		String str= "Delhi is the capital of india";
		
		str = str.replaceAll(" " ,"");
		System.out.println(str);
		
	}
	}