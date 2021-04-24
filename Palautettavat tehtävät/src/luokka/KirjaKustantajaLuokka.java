package luokka;

import java.util.Scanner;

public class KirjaKustantajaLuokka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Kirja kirja = new Kirja("Java-ohjelmointi", "978-952-14-3556-0", 65.5, 2018, null);
		System.out.print("Kustantajan nimi: ");
	    String nimi = input.nextLine();
	    System.out.print("Kustantajan osoite: ");
	    String os = input.nextLine();
	    System.out.print("Kustantajan puhelin: ");
	    String puh = input.nextLine();
	    Kustantaja k = new Kustantaja(nimi, os, puh);
	    kirja.setK(k);
	    System.out.println("Kirjan " + kirja.getNimi() + " kustantaja on " + kirja.getK().getNimi());
	}

}
