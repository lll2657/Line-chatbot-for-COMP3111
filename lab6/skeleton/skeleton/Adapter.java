package skeleton;

import java.util.HashMap;

public class Adapter {
	public static final String[] BEVERAGES = new String[] {
			"11", "Caff� Mocha", "Caff� Latte", 
			"Cappuccino", "Caramel Macchiato", "Espresso" }; // You can change these

	/**
	* This function compute the edit distance between a string and every 
	* strings in your selected beverage set. The beverage with the minimum 
	* edit distance <= 3 is returned. The use of Wagner_Fischer algorithm
	* is shown in the main function in WagnerFischer.java
	**/
	public String getBeverage(String s){
		// TODO: find the word with minimum edit distance
		int min = 10;
		String beverage = null;
		for(int i=0; i<BEVERAGES.length; i++){
			WagnerFischer wf = new WagnerFischer(s, BEVERAGES[i]);
			if(wf.getDistance()<min){
				min = wf.getDistance();
				beverage = BEVERAGES[i];
			}
		}
		if(min>3){
			return null;
		}
		else{
			return beverage;
		}
	}
}
