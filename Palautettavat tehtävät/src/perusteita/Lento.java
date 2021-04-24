package perusteita;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fin = "AY";
		int rus = 7;
		int lh = 1;
		String km = "23456";
		
		System.out.print("Anna lennon numero: ");
		String lnro = input.nextLine();
		String ly = lnro.substring(0, 2);
		String osa = lnro.substring(2, 3);
		int num = Integer.parseInt(osa);
		
		if (ly.equalsIgnoreCase(fin) == true) {
			if (num == rus) {
				System.out.println("Venäjän lento");
			} else if (num == lh) {
				System.out.println("Kaukolento");
			} else if (km.contains(osa)) {
				System.out.println("Kotimaan lento");
			} 
		} else {
			System.out.println("Ei ole Finnairin lento");
		}
	}

}
