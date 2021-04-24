package perusteita;

import java.time.LocalDate;

import java.util.Scanner;

/*Päivämäärä:Teeohjelma,jokakysyylaskuneräpäivän.
Ohjelmakertoosenjälkeen, olisiko lasku pitänyt jo maksaa,
pitääkö lasku maksaa tänään vai voiko laskun maksaa myöhemmin. 
Tutustus LocalDate luokan metodeihin equals ja isAfter/isBefore.*/


public class kertaus2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String pvm = input.nextLine();
		
		
		try {
			LocalDate paivamaara = LocalDate.parse(pvm);
			LocalDate nyt = LocalDate.now();
			if (paivamaara.isBefore(nyt)){
				System.out.println("Eräpäivä ohi");
			} else if (paivamaara.equals(nyt)) {
				System.out.println("Eräpäivä on tänään");
			} else if (paivamaara.isAfter(nyt)) {
				System.out.println("Eräpäivä on myöhemmin" );
			}
		} catch (Exception error) {
			System.out.print("Laskun päivämäärä on virheellinen");
		}
		
	}

}
