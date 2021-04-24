package perusteita;

import java.util.Scanner;


public class Cooper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matka, kierroksia;
		final int KIERROS = 400;
		
		System.out.print("Anna juostu matka: ");
		Scanner ip = new Scanner(System.in);
		matka = ip.nextInt();
		
		kierroksia = matka / KIERROS;
		
		System.out.println("Kokonaisia 400 metrin kierroksia oli " + kierroksia);
	}

}
