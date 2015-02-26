package com.chan.stanley.shapes;

import com.chan.stanley.shapes.impl.Circle;
import com.chan.stanley.shapes.impl.Square;
import com.chan.stanley.shapes.impl.Triangle;


public class ShapeTester {
	public static void main(String[] args){
		
		Shape[] shapesList = new Shape[4];
		
		
		Shape shape = new Shape("Kirby");
		
		shape.rotate();
		shape.playSound();
		shape.getColor();
	
		shapesList[0] = shape;
		
		System.out.println("-----------------------------------------");
		
		Circle circle = new Circle("Toby");
		
		circle.rotate(); // method was changed with an extra line to show the overriding method's difference
		circle.playSound();
		circle.getColor();
		circle.mySpecialFunction(); // to show that subclasses can have their own methods
			
		shapesList[1] = circle;
			
		System.out.println("-----------------------------------------");
		
		Square square = new Square("Penny");
		
		square.rotate();
		square.playSound();
		square.getColor();
		
		shapesList[2] = square;
		
		System.out.println("-----------------------------------------");
		
		Triangle triangle = new Triangle("Annie");
		
		triangle.rotate();
		triangle.playSound();
		triangle.getColor();
		
		shapesList[3] = triangle;
		
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		
		for(int i = 0 ; i < shapesList.length ; i++){
			Shape item = shapesList[i];
			item.playSound();
		}
		
	}
}
