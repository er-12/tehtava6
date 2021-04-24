package luokkakertaus;

import java.util.Scanner;


public class AutoOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Anna merkki: ");
	    String mer = input.nextLine();
	    System.out.print("Anna malli: ");
	    String mal = input.nextLine();
	    System.out.print("Anna reknro: ");
	    String rek = input.nextLine();
	    System.out.print("Anna vuosi: ");
	    int v = input.nextInt();
	    input.nextLine();
	    Auto auto = new Auto(mal, mer, rek, v);
	    System.out.print("Anna nimi: ");
	    String nimi = input.nextLine();
	    System.out.print("Anna os: ");
	    String os = input.nextLine();
	    Henkilo hlo = new Henkilo();
	    hlo.setNimi(nimi);
	    hlo.setOsoite(os);
	    hlo.setAuto(auto);
	    
	    System.out.println("Nimi: " + hlo.getNimi() + "\nOs: " + hlo.getOsoite() + "\nAuto: " + hlo.getAuto().getMerkki() + hlo.getAuto().getMalli());
	}

}
