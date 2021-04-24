package perusteita;

import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String pvm = input.nextLine();
		
		try {
		LocalDate paivamaara = LocalDate.parse(pvm);
		LocalDate erapaiva = paivamaara.plusDays(14);
		System.out.print("Eräpäivä on " + erapaiva);
		} catch (Exception error) {
			System.out.print("Laskun päivämäärä on virheellinen");
		}
	}

}
