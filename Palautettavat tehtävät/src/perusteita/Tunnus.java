package perusteita;

import java.util.Scanner;

public class Tunnus {
	
	public String teeTunnus(String etu, String suku) {
		String kt = "";
		String osa = etu.toLowerCase().substring(0, 3);
		String osa2 = suku.toLowerCase().substring(0, 3);
		kt = osa2 + osa;
		return kt;
	}
	
	public static void main(String[] args) {
		Tunnus ohjelma = new Tunnus();
		Scanner input = new Scanner(System.in);
		System.out.print("Anna sukunimi: ");
		String suku = input.nextLine();
		System.out.print("Anna etunimi: ");
		String etu = input.nextLine();
		String tunnus = ohjelma.teeTunnus(etu, suku);
		System.out.print("Tunnus on " + tunnus);
	}

}
