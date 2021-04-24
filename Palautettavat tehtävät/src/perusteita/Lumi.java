package perusteita;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lkm = 0;
		int lumilkm = 0;
		
		while (true) {
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		if (nimi.equals("LOPPU") == true) {
			break;
		}
		lkm++;
		if (nimi.equalsIgnoreCase("Lumi")) {
			lumilkm++;
		}
		
		}
		System.out.println("Nimiä oli " + lkm + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + lumilkm + " kertaa.");

	}

}
