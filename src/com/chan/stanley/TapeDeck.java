package com.chan.stanley;

public class TapeDeck{
	boolean canRecord = false;
	
	void playTape(){
		System.out.println("tape playing");
	}
	void recordTape(){
		System.out.println("tape recording");
	}
	

}

class TapeDeckTestDrive {
	public static void main (String[]args){
	TapeDeck t = new TapeDeck(); // exercise did not create the TapeDeck object "t"
	t.canRecord = true;
	t.playTape();
	
	if (t.canRecord == true){
		t.recordTape();
	}
	}
		
}
