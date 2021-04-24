package perusteita;

import java.util.Scanner;

public class Kellonaika {
	
	public String kysyKellonaika() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String kellonaika = input.nextLine();
		return kellonaika;
	}
	
	public boolean tarkastaKellonaika(String kellonaika) {
		if (kellonaika.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")==true) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Kellonaika ohjelma = new Kellonaika();
		String ka = ohjelma.kysyKellonaika();
		boolean vastaus = ohjelma.tarkastaKellonaika(ka);
		if (vastaus == true) {
			System.out.print("Kellonaika on oikein");
		} else {
			System.out.print("Kellonaika on väärin");
		}
	}

}
