package com.peyton.oob_converter.main;

import java.util.Scanner;

public class Runner {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
			System.out.println("Enter your input phrase: ");
			String input = reader.nextLine();
			System.out.println("Converted text:\n"+ translate(input));
		}
	}
	
	public static String translate(String input){
		String output;
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		char[] inputArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		Boolean vowel = false;
		for(char c:inputArray){
			vowel = false;
			for(char v:vowels){
				if(c==v){
					sb.append("oob");
					vowel = true;
					break;
				}
			}
			if(vowel==false){
				sb.append(c);
			}
		}
		output = sb.toString();
		return output;
	}
}
