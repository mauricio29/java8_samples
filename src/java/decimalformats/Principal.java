package decimalformats;

// REF
// https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		
		// test 2
		Locale.setDefault(new Locale("en", "US"));

		String pattern = "$###,###.00";
		Double value = 200100100.565d;
		Locale loc = Locale.getDefault();
		
		NumberFormat nf = NumberFormat.getNumberInstance(loc);
		DecimalFormat df = (DecimalFormat)nf;
		df.applyPattern(pattern);
		String output = df.format(value);
		
		System.out.println("Pattern: " + pattern + "\n"
				+ "Value: " + output + "\n" + "Locale: " + loc.toString());

	
		// test 2
		System.out.println("\n");
		Float f =  15001000.1f;
		Double d = 1.04515379E7d;

		System.out.println("Float:  " + f.toString());
		System.out.println("Double: " + d.toString());
		
	
	}
	

}
