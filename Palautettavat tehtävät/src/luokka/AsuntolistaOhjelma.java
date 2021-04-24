package luokka;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AsuntolistaOhjelma {
	
	ArrayList<Asunto> asuntoLista = new ArrayList<Asunto>();
	Scanner input = new Scanner(System.in);
	DecimalFormat des = new DecimalFormat("0.00");
	
	public void lisaaAsunto() {
		
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
		asuntoLista.add(asunto);
	}
	
	public void naytaAsunnot() {
		Asunto asunto;
		for (int i = 0; i < asuntoLista.size(); i++) {
			asunto = asuntoLista.get(i);
			System.out.println("Tyyppi: " + asunto.getTyyppi() + "\nOsoite: " + asunto.getOsoite() + "\nPinta-ala: " + des.format(asunto.getPintaala()) + "\nHinta: " + des.format(asunto.getHinta()) + " euroa" + "\nKuvaus: " + asunto.getKuvaus() +"\n");
		}
	}
	
	public static void main(String[] args) {
		AsuntolistaOhjelma ohj = new AsuntolistaOhjelma();
		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.print("1. Lisää asunto \n2. Näytä asunnot \n0. Lopetus\n");
		System.out.print("Anna valintasi (0-2): ");
		String valinta = input.nextLine();
		if (valinta.equals("1")) {
			ohj.lisaaAsunto();
		} else if (valinta.equals("2")) {
			ohj.naytaAsunnot();
		} else if (valinta.equals("0")) {
			break;
		}
		}
	}

}
