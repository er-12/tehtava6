package perusteita;

import java.util.Scanner;

public class Hissi {

	public static void main(String[] args) {
		int yhteensa = 0;
		int paino;
		do {
			System.out.print("Paljonko painat: ");
			Scanner ip = new Scanner(System.in);
			paino = ip.nextInt();
			yhteensa = yhteensa + paino;
			
			if (paino == 0) {
				break;
			}
			if (yhteensa < 240) {
				System.out.println("Tule kyytiin.");
			}	
			if (yhteensa > 240) {
				System.out.println("Hissi on jo täynnä. Odota seuraavaa hissiä.");
			}
			
	      } while (yhteensa < 240 && paino != 0);
	}

}
