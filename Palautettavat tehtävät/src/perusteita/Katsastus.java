package perusteita;

import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int hinta = 0;
		int komento = input.nextInt();
		int jtark = 30;
		int katsastus = 50;
		int paastotb = 22;
		int paastotd = 31;
		
		if (komento == 2) {
			hinta = jtark;
		} else {
			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			int komento2 = input.nextInt();
			if (komento2 == 0) {
				hinta = katsastus;
			} else {
				System.out.print("Onko auto 0=bensa, 1=diesel: ");
				int komento3 = input.nextInt();
				if (komento3 == 0) {
					hinta = katsastus + paastotb;
				} else {
					hinta = katsastus + paastotd;
				}
			}
		}
		
		System.out.print("Hinta on " + hinta);
	}

}
