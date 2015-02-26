package com.chan.stanley.shapes.impl;

import com.chan.stanley.shapes.Shape; //used to reference a folder outside of the current folder

public class Square extends Shape{

	public Square(String inputMyName) {
		super(inputMyName);	
	}
	
	@Override
	public void rotate(){
		System.out.println("Square: " + getName() + " always rotate left.");
	}
	@Override
	public void playSound(){		
		System.out.println("Square: " + getName() + " sounded like a rabbit.");
	}	
	
}
