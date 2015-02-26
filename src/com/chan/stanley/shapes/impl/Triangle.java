package com.chan.stanley.shapes.impl;

import com.chan.stanley.shapes.Shape; //used to reference a folder outside of the current folder

public class Triangle extends Shape{

	public Triangle(String inputMyName) {
		super(inputMyName);		
	}
	@Override
	public void rotate(){
		System.out.println("Triangle: " + getName() + " always rotate right.");
	}
	@Override
	public void playSound(){		
		System.out.println("Triangle: " + getName() + " sounded like a cow.");
	}	
	@Override
	public void getColor(){		
		System.out.println("Triangle: " + getName() + " am always red.");
	}
}