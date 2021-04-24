package luokka;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Laakekorvaus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		
		System.out.print("Anna ostoksen hinta: ");
		double hinta = input.nextDouble();
		double korvattava = hinta - 50.0;
		double maksettavaa = 0.0;
		double katto = 579.78;
		
		if (korvattava <= 0) {
			maksettavaa = hinta;
		} else if (korvattava > 0 && hinta <= katto) {
			maksettavaa = hinta - (korvattava * 0.4);
		} else {
			korvattava = katto - 50.0;
			maksettavaa = katto - (korvattava * 0.4);
		}
		
		System.out.println("Maksettavaa jää " + des.format(maksettavaa));
	}

}
