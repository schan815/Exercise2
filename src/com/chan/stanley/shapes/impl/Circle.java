package com.chan.stanley.shapes.impl;

import com.chan.stanley.shapes.Shape; //used to reference a folder outside of the current folder

public class Circle extends Shape{

	public Circle(String inputMyName) {
		super(inputMyName);		
	}
	
	@Override //@Override is an annotation. it does not actually perform the override but will tell you if you failed at creating an override.
	public void rotate(){
		System.out.println("Circle: " + getName() + " always rotate right. Also, I do what I want due to overriding.");
	}	

	public void mySpecialFunction(){
		System.out.println("Circle: " + getName() + " Shhhh! it is a secret.");
	}
	
}
