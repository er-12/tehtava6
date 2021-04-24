package luokka;

import java.util.Scanner;

public class RemonttiOhjelmaMetodeilla {
	Remontti remppa = new Remontti();
	
	public void teeRemontti(){
		Scanner input = new Scanner(System.in);
		System.out.print("Anna vuosi: "); 
		int vuosi = input.nextInt();
		remppa.setVuosi(vuosi);
	    System.out.print("Anna kuvaus: ");
	    input.nextLine();
	    String remontti = input.nextLine();
	    remppa.setKuvaus(remontti);
	    System.out.println("Vuonna " + remppa.getVuosi() + " tehtiin remontti " + remppa.getKuvaus());
	}
	public void naytaRemontti(){
		System.out.println("Vuosi: " + remppa.getVuosi());
		System.out.println("Kuvaus: " + remppa.getKuvaus());
	}
	public void muutaRemontti(){
		Scanner input = new Scanner(System.in);
		System.out.print("Anna vuosi: "); 
		int vuosi = input.nextInt();
		remppa.setVuosi(vuosi);
	    System.out.print("Anna kuvaus: ");
	    input.nextLine();
	    String remontti = input.nextLine();
	    remppa.setKuvaus(remontti);
	    System.out.println("Vuonna " + remppa.getVuosi() + " tehtiin remontti " + remppa.getKuvaus());
	}

	public static void main(String[] args) {
		RemonttiOhjelmaMetodeilla rem = new RemonttiOhjelmaMetodeilla();
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("1. Tee remontti \n2. Näytä remonttitiedot \n3. Muuta remonttia \n0. Lopetus\n");
			System.out.println("Anna valintasi (0-3): ");
			String valinta = input.nextLine();
			if (valinta.equals("1")) {
				rem.teeRemontti();
			} else if (valinta.equals("2")) {
				rem.naytaRemontti();
			} else if (valinta.equals("3")) {
				rem.muutaRemontti();
			} else if (valinta.equals("0")) {
				break;
			}
		}
	}

}
