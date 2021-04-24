package perusteita;

import java.util.Scanner;
import java.math.*;


@SuppressWarnings("unused")
public class Juhlat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vieraat, tarvitaan;
		double pullot;
		final double LASEJA = 7.0;
		
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		Scanner input = new Scanner(System.in);
		
		vieraat = input.nextInt();
		pullot = vieraat / LASEJA;
		tarvitaan = (int)Math.ceil(pullot);
		
		System.out.print("Pulloja tarvitaan " + tarvitaan + " kappaletta");
	}

}
