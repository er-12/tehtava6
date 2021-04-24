package luokka;

import java.time.LocalDate;
import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		Remontti remppa = new Remontti();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna vuosi: "); 
		int vuosi = input.nextInt();
		remppa.setVuosi(vuosi);
		
		if (remppa.setVuosi(vuosi)==false) {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		}
		if (remppa.setVuosi(vuosi)==true) {
			System.out.print("Anna kuvaus: ");
			input.nextLine();
			String kuvaus = input.nextLine();
			remppa.setKuvaus(kuvaus);
		
			System.out.println("Vuonna " + remppa.getVuosi() + " tehtiin remontti " + remppa.getKuvaus());
		}
		
	}

}

