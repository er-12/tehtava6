package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sahkolasku {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		
		System.out.print("Anna kilowatin hinta euroina: ");
		double hinta = input.nextDouble();
		int[] kulut;
		kulut = new int[6];
		
		for (int i = 0; i < 6; i++) {
			System.out.print("Anna kuukauden " + (i + 1) + " sähkölukema: ");
			int lukema = input.nextInt();
			kulut[i] = lukema; 
		}
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + ". kuukauden kulutus: " + kulut[i] + "kWh " + des.format(hinta*kulut[i]) + " euroa");
		}
		

	}

}
