package luokka;

import java.util.Scanner;
import luokka.Henkilo;

public class RemonttiTekijaOhjelma {

	public static void main(String[] args) {
		Remontti remppa = new Remontti();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna vuosi: "); 
		int vuosi = input.nextInt();
		remppa.setVuosi(vuosi);
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
		remppa.setKuvaus(kuvaus);
		System.out.print("Anna tekijän nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna tekijän osoite: ");
		String osoite = input.nextLine();
		Henkilo hlo = new Henkilo(nimi, osoite);
		remppa.setTekija(hlo);

		System.out.println("Vuonna " + remppa.getVuosi() + " tehtiin remontti " + remppa.getKuvaus() + 
				"\nRemontin teki " + remppa.getTekija().getNimi());
	}

}
