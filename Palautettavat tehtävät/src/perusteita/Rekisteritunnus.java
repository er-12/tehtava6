package perusteita;

import java.util.Scanner;

public class Rekisteritunnus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna rekisterinumero: ");
		String rek = input.nextLine();
		String rek2 = rek.substring(0, 3).toUpperCase();
		String rek3 = rek2 + rek.substring(3);
		
		
		if (rek3.matches("[A-ZÅÄÖ]{2,3}-[1-9][0-9]{0,2}") == true) {
			System.out.println("Rekisterinumero on kelvollinen");
		} else if (rek3.matches("[A-ZÅÄÖ]{2,3}-[1-9][0-9]{0,2}") == false) {
			System.out.println("Rekisterinumero ei ole kelvollinen");
		} 
	}

}
