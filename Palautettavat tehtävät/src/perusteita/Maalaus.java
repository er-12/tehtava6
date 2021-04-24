package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double leveys, pituus, korkeus, neliot, maalintarve;
		
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		
		Scanner input = new Scanner(System.in);
		leveys = input.nextDouble();
		pituus = input.nextDouble();
		korkeus = input.nextDouble();
		
		System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
		neliot = input.nextDouble();
		
		maalintarve = ((leveys + leveys + pituus + pituus) * korkeus / neliot);
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Maalin tarve on " + des.format(maalintarve) + " litraa");
	}

}
