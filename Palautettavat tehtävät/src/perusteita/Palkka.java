package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna palkka: ");
		int palkka = input.nextInt();
		System.out.print("Anna veroprosentti: ");
		double verop = input.nextInt();
		System.out.print("Anna ikä: ");
		int ika = input.nextInt();
		
		double vero = palkka * (verop / 100);
		double tvak = palkka * 0.0125;
		double tempros;
		if (ika >= 53 && ika <= 62) {
			tempros = 0.0865;
		} else {
			tempros = 0.0715;
		}
		
		double tem = palkka * tempros;
		double netto = palkka - vero - tvak - tem;
		
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Bruttopalkka " + palkka);
		System.out.println("Veron osuus " + des.format(vero));
		System.out.println("Työeläkevakuutusmaksun osuus " + des.format(tem));
		System.out.println("Työttömyysvakuutuksen osuus " + des.format(tvak));
		System.out.println("Käteen jää " + des.format(netto));
	}

}
