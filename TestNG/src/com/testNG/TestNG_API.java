package com.testNG;

public class TestNG_API {

	public static void main(String[] args) {
		String Original ="Welcome to reverse";
		 String ReversedString ="";
		String[]b=Original.split(" ");
		for(String data:b) {
			for(int i=data.length()-1;i>=0;i--)	{
				 ReversedString +=data.charAt(i);
			}
			ReversedString +=" ";
		}
		
		
		System.out.println(	ReversedString);
		

	}

}
