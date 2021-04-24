package perusteita;

import java.text.DecimalFormat;

public class Sademaara {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		double [] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};
		double summa = 0;
		for (int i=0; i<sademaarat.length; i++) {
			summa = summa + sademaarat[i];
		}
		System.out.println("Vuoden sademäärä on " + des.format(summa) + " mm"); 
		
	}

}
