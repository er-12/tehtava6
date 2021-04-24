package perusteita;

import java.util.ArrayList;
import java.util.Scanner;


public class LintuOhjelma {

	ArrayList<Lintu> linnut = new ArrayList<Lintu>();
	
	public Lintu etsiLintu(String laji) {
		
		int i = 0;
		Lintu lintu = null;
		boolean loyt = false;
		
		while (!loyt && i < linnut.size()) {
			lintu = linnut.get(i);
			String linnunlaji = lintu.getLaji();
			if (linnunlaji.equals(laji)) {
				loyt = true;
			} else {
				i++;
			}
		}
		if (loyt == true) {
			return lintu;
		} else {
			return null;
		}	
	
	}
	public void lisaaLintu(String laji) {
		
		Lintu lintu = new Lintu();
		lintu.setLaji(laji);
		lintu.setMaara(1);
		linnut.add(lintu);
	}
	
	public void lisaaMerkinta(String laji) {
		Lintu li = etsiLintu(laji);
		if (li != null) {
			li.lisaa();
		} else {
			lisaaLintu(laji);
		}
	}
	
	public void naytaLinnut() {
		for (int i = 0; i < linnut.size(); i++) {
			System.out.println("Laji: " + linnut.get(i).getLaji() + "\nMäärä: " + linnut.get(i).getMaara() + "\n");
		}
		
	}
	
	public static void main(String[] args) {
		LintuOhjelma ohj = new LintuOhjelma();
		Scanner input = new Scanner(System.in);

		int valinta = -1;

		do {
			System.out.println("\n1 = Lisää uusi merkintä");
			System.out.println("2 = Näytä kaikki merkinnät");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi (0-2): ");
			valinta = input.nextInt();
			input.nextLine();
			switch (valinta) {
			case 1:
				System.out.print("Anna laji: ");
				String laji = input.nextLine();
				ohj.lisaaMerkinta(laji);
				break;
			case 2:
				ohj.naytaLinnut();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}

}
