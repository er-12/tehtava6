package luokka;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		
		System.out.print("Anna asunnon tyyppi: "); 
		String tyyppi = input.nextLine();
		System.out.print("Anna osoite: "); 
		String osoite = input.nextLine();
		System.out.print("Anna pinta-ala: "); 
		double pintaala = input.nextDouble();
		System.out.print("Anna hinta: "); 
		double hinta = input.nextDouble(); 
		System.out.print("Anna kuvaus: "); 
		input.nextLine();
		String kuvaus = input.nextLine();
		System.out.println();
		Asunto asunto = new Asunto(tyyppi, osoite, pintaala, hinta, kuvaus);
		System.out.println("Tyyppi: " + asunto.getTyyppi() +
                "\nOsoite: " + asunto.getOsoite() + 
                "\nPinta-ala: " + des.format(asunto.getPintaala()) +
                "\nHinta: " + des.format(asunto.getHinta()) + " euroa " +
                "\nKuvaus: " + asunto.getKuvaus());
	}
}
