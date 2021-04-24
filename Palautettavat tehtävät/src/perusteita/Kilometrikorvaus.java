package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
		Scanner ip = new Scanner(System.in);
		int km = ip.nextInt();
		
		int summa = 0;
		while (km != 0) {
		   summa = summa + km;
		   System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
		   
		   km = ip.nextInt();
		}
		System.out.println("Yhteensä " + summa + " kilometriä");
		System.out.println("Korvaus on " + des.format(summa * 0.44) + " euroa");
	}

}
