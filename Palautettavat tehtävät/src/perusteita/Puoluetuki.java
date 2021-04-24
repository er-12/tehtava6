package perusteita;

import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kansanedustajat;
		final int PUOLUETUKI = 178175;
		int tuki;
		
		System.out.print("Anna kansanedustajien lukumäärä: ");
		
		Scanner input = new Scanner(System.in);
		kansanedustajat = input.nextInt();
		
		tuki = kansanedustajat * PUOLUETUKI;
		System.out.println("Puoluetuen määrä on " + tuki + " euroa");
		
	}

}
