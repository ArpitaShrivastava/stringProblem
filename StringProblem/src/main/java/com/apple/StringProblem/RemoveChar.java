package com.apple.StringProblem;


public class RemoveChar 
{
	public String removeCharByChar(String str,char c){
		char arr[]= str.toCharArray();
		String removedChar="";
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=c){
				removedChar = removedChar+arr[i];
			}
		}
		return removedChar;
	}
	
	public String removeCharByMethod(String str,char c){
		StringBuilder builder = new StringBuilder();
		builder.append(c);
		String removedChar=str.toLowerCase().replaceAll(builder.toString(),str);
		
		return removedChar;
	}
}
