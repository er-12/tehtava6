package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		Scanner ip = new Scanner(System.in);
		double tk = ip.nextDouble();
		
		double summa = 0;
		while (tk != 0) {
		   summa = summa + tk;
		   System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		   tk = ip.nextDouble();
		}
		double ktv = summa * 40 / 100.0 - 100;
		if (ktv >= 2250.0) {
			ktv = 2250.0;
		} else if (ktv < 0.0) {
			ktv = 0.0;
		}
		System.out.println("Kotitalousvähennyksen määrä on " + des.format(ktv) + " euroa");
	}

}
