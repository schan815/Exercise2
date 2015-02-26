package com.chan.stanley;

public class DVDPlayer {
	boolean canRecord = false; //why is this false?
	
	//called a class constructor
	public DVDPlayer(){
		System.out.println("being instantianted");
	}
	
	public void recordDVD() { //why is this "void"?
		System.out.println("DVD recording");
	}
	public void playDVD() { //exercise did not assign method "playDVD"
		System.out.println("DVD playing");
	}
	

}

