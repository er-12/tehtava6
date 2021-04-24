package perusteita;

import java.util.Scanner;

public class Dominion {
	
	public int laskePisteet(int kirous, int tila, int pitaja, int laani) { 
		int yht = 0;
		int k = -1;
		int t = 2;
		int p = 5;
		int l = 8;
		yht = (kirous * k) + (tila * t) + (pitaja * p) + (laani * l); 
		return yht;
	}

	public static void main(String[] args) {
		Dominion ohjelma = new Dominion();
		Scanner input = new Scanner(System.in);
		System.out.print("Anna kirouskorttien määrä: ");
		int kirous = input.nextInt();
		System.out.print("Anna tilakorttien määrä: ");
		int tila = input.nextInt();
		System.out.print("Anna pitäjäkorttien määrä: ");
		int pitaja = input.nextInt();
		System.out.print("Anna läänikorttien määrä: ");
		int laani = input.nextInt();
		int yht = ohjelma.laskePisteet(kirous, tila, pitaja, laani);
		System.out.print("Pisteiden yhteismäärä on " + yht);
	}

}
