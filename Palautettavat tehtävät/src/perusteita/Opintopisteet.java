package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna lukukausien määrä: ");
		Scanner ip = new Scanner(System.in);
		int lk = ip.nextInt();
		int i = 1;
		int summa = 0;
		int tavoite = lk * 30;
		int tutkinto = 210;
		
		while (i <= lk) {
		   System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
		   
		   int op = ip.nextInt();
		   summa = summa + op;
		   i++;
		}
		String vastaus = "";
		int puuttuu = tutkinto - summa;
		int erotus = tavoite - summa;
		if (erotus < 0) {
			vastaus = "Olet edellä tavoitteesta.";
		} else if (erotus == 0) {
			vastaus = "Olet tavoitteessa.";
		} else {
			vastaus = "Olet jäljessä tavoitteesta.";
		}
		System.out.println("Sinulla pitäisi olla tähän mennessä " + des.format(tavoite) + " opintopistettä.");
		System.out.println("Sinulla on " + des.format(summa) + " opintopistettä.");
		System.out.println(vastaus);
		System.out.println("Tutkinnosta puuttuu vielä " + des.format(puuttuu) + " opintopistettä.");
	}

}
