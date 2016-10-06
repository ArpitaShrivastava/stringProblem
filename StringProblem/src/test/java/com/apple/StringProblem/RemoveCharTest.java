package com.apple.StringProblem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveCharTest{
	RemoveChar removed ;
	@Test
	public void TestremoveCharByChar1(){
	    removed = new RemoveChar();
	    String actual= removed.removeCharByChar("haelloaaworldaaa",'a');
	    Assert.assertEquals(actual,"helloworld");
		
	}
	@Test
	public void TestremoveCharByChar2(){
	    removed = new RemoveChar();
	    String actual= removed.removeCharByChar("aaaaaaaaa",'a');
	    Assert.assertEquals(actual,"");
		
	}
	@Test
	public void TestremoveCharByChar3(){
	    removed = new RemoveChar();
	    String inputString = "haelloaaworldaaa";
		String actual= removed.removeCharByChar(inputString,'b');
	    Assert.assertEquals(actual,inputString);
		
	}
	@Test
	public void TestremoveCharByMethod1(){
	    removed = new RemoveChar();
	    String inputString = "haelloaaworldaaa";
		String actual= removed.removeCharByMethod(inputString,'b');
	    Assert.assertEquals(actual,inputString);
		
	}
}