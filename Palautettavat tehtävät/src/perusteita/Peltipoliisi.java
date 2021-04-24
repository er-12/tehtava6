package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Peltipoliisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		
		System.out.print("Anna nopeutesi: ");
		int nopeus = input.nextInt();
		
		if (nopeus <= 80) {
			System.out.println("Ei sakkoja");
		} else if (nopeus > 80 && nopeus <= 100) {
			System.out.println("Liikennevirhemaksu");
		} else if (nopeus > 100) {
			System.out.println("Päiväsakko");
			System.out.print("Anna nettokuukausitulosi: ");
			double tulot = input.nextDouble();
			double sakko = (tulot - 255) / 60;
			if (sakko < 6.0) {
				sakko = 6.0;
			}
			System.out.println("Päiväsakon määrä on " + des.format(sakko) + " euroa");
		}
			

	}

}
