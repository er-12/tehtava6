package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class kertaus1 {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna kkpalkka: ");
		Scanner input = new Scanner(System.in);
		String kkp = input.nextLine();
		double kkpnro = 0;
		
		if (!kkp.matches("\\d+.\\d*{2}")) {
			System.out.println("Kuukausipalkka pitää olla numeerinen");
		} else {
			kkpnro = Double.parseDouble(kkp);
			if (kkpnro > 10000) {
				System.out.println("Palkka on liian suuri");
				
			} else {
				System.out.println("Kuukausipalkka on " + des.format(kkpnro));
			}
	}
	}
}