package luokka;
import java.util.Scanner;
import java.util.ArrayList;

public class DominionlistaOhjelma {
	ArrayList<Pelaaja> pelaajaLista = new ArrayList<Pelaaja>();
	static int laanit = 0;
	Scanner input = new Scanner(System.in);
	
	public void lisaaPelaaja(int i) {
		Pelaaja p = new Pelaaja();
		System.out.print("Anna pelaajan nimi: ");
		String nimi = input.nextLine();
		p.setNimi(nimi);
		pelaajaLista.add(i, p);
		
	}
	public Pelaaja etsiPelaaja(String nimi) {
		int i = 0;
		Pelaaja p = null;
		boolean loyt = false;
		while (!loyt && i < pelaajaLista.size()) {
			p = pelaajaLista.get(i);
			String pnimi = p.getNimi();
			if (pnimi.equals(nimi)) {
				loyt = true;
			} else {
				i++;
			}
		}
		if (loyt == true) {
			return p;
		} else {
			return null;
		}	
	
	}
	public void lisaaPisteet(String nimi) {
		Pelaaja p = etsiPelaaja(nimi);
		int pisteet = 0;
			
		System.out.print("K=kirous, T=tila, P=pitäjä, L=lääni: ");
		String kortti = input.nextLine();
		if (kortti.equals("K")) {
			pisteet = -1;
		} else if (kortti.equals("T")) {
			pisteet = 2;
		} else if (kortti.equals("P")) {
			pisteet = 5;
		} else if (kortti.equals("L")) {
			pisteet = 8;
			laanit = laanit + 1;
		}
		p.setPisteet(p.getPisteet()+pisteet);
	}
	
	public void etsiVoittaja() {
		
		int i = 0;
		Pelaaja p = pelaajaLista.get(0);
		int pisteet = p.getPisteet();
		String voittaja = p.getNimi();
		int vp = p.getPisteet();
		
		for (i = 1; i < pelaajaLista.size(); i++) {
			Pelaaja p2 = pelaajaLista.get(i);
			int ppist = p2.getPisteet();
			if (ppist > pisteet) {
				voittaja = p2.getNimi();
				vp = p2.getPisteet();
		} 
		}
		System.out.println("Voittaja oli " + voittaja + " pisteillä " + vp);	
	}
	public void naytaPisteet() {
		Pelaaja p;
		for (int i = 0; i < pelaajaLista.size(); i++) {
			p = pelaajaLista.get(i);
			System.out.println(p.getNimi() + " " + p.getPisteet() + " pistettä");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DominionlistaOhjelma ohj = new DominionlistaOhjelma();
		System.out.print("Montako pelaajia on: ");
		int luku = input.nextInt();
		input.nextLine();
		for (int i = 0; i < luku; i++) {
			ohj.lisaaPelaaja(i);
		}
		while (laanit < 8) {
			System.out.print("Kuka sai pisteitä: "); 
			String nimi = input.nextLine();
			ohj.lisaaPisteet(nimi);
			ohj.naytaPisteet();
			System.out.println();
		}
		if (laanit >= 8) {
			ohj.etsiVoittaja();
		}
	}

}
