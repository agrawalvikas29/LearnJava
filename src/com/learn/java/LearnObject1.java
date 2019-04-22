/**
 * 
 */
package com.learn.java;

/**
 * @author vikas
 * Creating a Box class to understand the object
 */
class Box {

	int length, breadth, height;  // these are called member variables
		
}

public class LearnObject1 {
	
	public static void main(String[] args) {
		
	
	Box box = new Box();
	
	System.out.println(box.length);
	System.out.println(box.breadth);
	System.out.println(box.height);
	
	box.length=10;
	box.breadth=20;
	box.height=30;
	
	System.out.println(box.length);
	System.out.println(box.breadth);
	System.out.println(box.height);

		
	}
}