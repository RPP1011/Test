import java.util.*;

import java.lang.*;




class RGBToHex
{
	
	

	public static String rgbToHex(int r, int g, int b)
 
	{
		
		String x = baseTenToSixteen(r);

		String y = baseTenToSixteen(g);

		String z = baseTenToSixteen(b);

		return "#"+x+y+z;
 
	
}
	
	
	private static String baseTenToSixteen(int value) {

		int dividedBySixteen = value/16;

		int modulusSixteen = value%16;



		char characterOneValue;

		char characterTwoValue;

		
		
		if(dividedBySixteen < 10) characterOneValue = (char)(dividedBySixteen + 48);

		else characterOneValue = (char)(dividedBySixteen + 87);



		
if(modulusSixteen < 10) characterTwoValue = (char)(modulusSixteen + 48);

		else characterTwoValue = (char)(modulusSixteen + 87);

		
return "" + characterOneValue + characterTwoValue;

	}

}