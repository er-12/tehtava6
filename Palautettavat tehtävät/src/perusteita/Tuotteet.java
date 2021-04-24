package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		
		System.out.print("Anna tuotenumero: ");
		int tuotenro = input.nextInt();
		input.nextLine();
		
		System.out.print("Anna tuotteen nimi: ");
		String nimi = input.nextLine();
		nimi.trim().toUpperCase();
		
		System.out.print("Anna tuotteen hinta: ");
		double hinta = input.nextDouble();
		input.nextLine();
		
		System.out.print("Anna tuotteen kuvaus: ");
		String kuvaus = input.nextLine();
		kuvaus.trim();
		
		System.out.println("Numero: " + tuotenro);
		System.out.println("Nimi: " + nimi);
		System.out.println("Hinta: " + des.format(hinta));
		if (kuvaus.length() >= 1) {
		System.out.println("Kuvaus: " + kuvaus);
		}
	}

}
