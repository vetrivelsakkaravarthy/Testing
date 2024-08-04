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
		
 int [] a= {23,45,67,10};
 int maxvalue=a[0];
 int minvalue=a[0];
 for(int i=0;i<a.length;i++) {
	 if(a[i]>maxvalue) {
		 maxvalue=a[i];
	 }
		 if(a[i]<minvalue) {
			 minvalue=a[i];
			 
		 }
	 }
	 System.out.println(maxvalue);
	 System.out.println(minvalue);
 }
 
 
	}


