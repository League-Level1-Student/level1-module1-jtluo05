/*
 Part1
 1: Create a class called Taco, then add 2 private String member variables for the meat and sauce.

2: Create methods getMeat() and getSauce() that return the member variables.

3: Create methods setMeat(String meat) and setSauce(String sauce) that set the values
 of the members variables to the values passed in the method parameters. 
*/
public class Taco {
	private String meat;
	private String sauce;

	String getSauce() {
		return sauce;
	}

	String getMeat() {
		return meat;
	}

	public void setMeat(String m) {
		meat = m;
	}

	public void setSauce(String s) {
		sauce = s;
	}

}
