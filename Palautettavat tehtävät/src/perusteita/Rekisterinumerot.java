package perusteita;

import java.util.Scanner;

public class Rekisterinumerot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX = 20;
		String[] rekt = new String[MAX];
		int lkm = 0;
		
		System.out.print("Anna rekisterinumero: ");
		String rek = input.nextLine();
		
		while (rek.equals("-") == false && lkm < MAX) {
			rekt[lkm] = rek;
			lkm++;
			if (lkm < MAX) {
				System.out.print("Anna rekisterinumero: ");
				rek = input.nextLine();
			}
		}
		for (int i = 0; i < lkm; i++) {
			System.out.println(rekt[i] + " ");
		}

	}

}
