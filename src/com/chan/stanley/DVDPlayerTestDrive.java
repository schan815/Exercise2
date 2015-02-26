package com.chan.stanley;

public class DVDPlayerTestDrive {

	public static void main(String[]args) { //I still don't really understand what main is and why it's here and not above
		DVDPlayer d = new DVDPlayer(); //what do the parentheses do or mean?
		d.canRecord = true;
		d.playDVD();
		if (d.canRecord == true) {
			d.recordDVD();
		}
		
		DVDPlayer f = new DVDPlayer(); //what do the parentheses do or mean?
		f.canRecord = false;
		f.playDVD();
		if (f.canRecord == true) {
			f.recordDVD();
		}
	}
}
