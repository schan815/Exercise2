package com.chan.stanley.shapes;

public class Shape {
	
	private String myName = "Dummy";
	
	//constructor that doesn't require an input, if removed, everyone is forced to use the constructor below with a required name
	//public Shape(){	
	//}
	//constructor that requires a name input
	public Shape(String inputMyName){
		this.myName = inputMyName; //this line is allowing "inputMyName" to reference the myName string from above to give it the name "Dummy"
	}

	public void rotate(){
		System.out.println("Shape: " + getName() + " always rotate left.");
	}
	
	public void playSound(){		
		System.out.println("Shape: " + getName() + " sounded like a chicken.");
	}	
	
	public void getColor(){		
		System.out.println("Shape: " + getName() + " am always blue.");
	}
	
	public String getName(){
		return myName;
	}
}
