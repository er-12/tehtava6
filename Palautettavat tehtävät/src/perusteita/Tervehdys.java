package perusteita;

import java.util.Scanner;

public class Tervehdys {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna tunnit: ");
		int tunnit = input.nextInt();
		
		if (tunnit >= 7 && tunnit < 10) {
			System.out.print("Hyvää huomenta!");
		} else if (tunnit >= 10 && tunnit < 17) {
			System.out.print("Hyvää päivää!");
		} else if (tunnit >= 17 && tunnit < 22) {
			System.out.print("Hyvää iltaa!");
		} else if (tunnit >= 22 && tunnit < 24) {
			System.out.print("Hyvää yötä!");
		} else if (tunnit >= 0 && tunnit < 7) {
			System.out.print("Hyvää yötä!");
		}
	}
}
