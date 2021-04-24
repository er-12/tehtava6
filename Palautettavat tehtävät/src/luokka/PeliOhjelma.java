package luokka;

import luokka.Henkilo;
import java.util.Scanner;


public class PeliOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Peli p = new Peli();
		while (true) {
			
			System.out.print("1. Tee pelaaja \n2. Pelaa \n3. Näytä peli \n0. Lopetus\n");
			System.out.print("Anna valintasi (0-3): ");
			String valinta = input.nextLine();
			
			if (valinta.equals("1")) {
				System.out.print("Anna nimesi : ");
				String nimi = input.nextLine();
				Henkilo h = new Henkilo(nimi, null);
				p.setPelaaja(h);
				
			} 
			if (valinta.equals("2")) {
				if (p.getPelaaja() == null) {
					System.out.println("Peli voi alkaa vasta, kun on asetettu pelaaja");
					break;
				}
				int a = 0;
				System.out.print("Anna arvaus: ");
				while (a != 73) {
				
				a = input.nextInt();
				
				if (a < 73) {
					System.out.print("Arvaa suurempaa: ");
					p.setArvauksia(p.getArvauksia()+1);
					
				} else if (a > 73) {
					System.out.print("Arvaa pienempää: ");
					p.setArvauksia(p.getArvauksia()+1);
				} else {
					System.out.println("Arvasit oikein");
					p.setArvauksia(p.getArvauksia()+1);
					p.setValmis(true);
					input.nextLine();
				}
				}
			}
			if (valinta.equals("3")) {
				if (p.isValmis() == false) {
					System.out.println("Peliä ei ole pelattu");
					break;
				}
				System.out.println(p.getPelaaja().getNimi() + " arvasi " + p.getArvauksia() + " kertaa numeroa 73");
			} 
			if (valinta.equals("0")) {
				break;
			}
		
	}
}
}
