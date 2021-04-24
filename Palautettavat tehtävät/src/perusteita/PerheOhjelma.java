package perusteita;

import java.util.Scanner;

public class PerheOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna isän nimi: ");
		String inimi = input.nextLine();
		System.out.print("Anna isän osoite: ");
		String iosoite = input.nextLine();
		Henkilo isa = new Henkilo();
		isa.setNimi(inimi);
		isa.setOsoite(iosoite);
		
		System.out.print("Anna äidin nimi: ");
		String animi = input.nextLine();
		System.out.print("Anna äidin osoite: ");
		String aosoite = input.nextLine();
		Henkilo aiti = new Henkilo();
		aiti.setNimi(animi);
		aiti.setOsoite(aosoite);
		
		System.out.print("Anna lapsen nimi: ");
		String lnimi = input.nextLine();
		System.out.print("Anna lapsen osoite: ");
		String losoite = input.nextLine();
		Henkilo lapsi = new Henkilo();
		lapsi.setNimi(lnimi);
		lapsi.setOsoite(losoite);
		lapsi.setIsa(isa);
		lapsi.setAiti(aiti);
		
		System.out.println("Lapsen isä on " + lapsi.getIsa().getNimi() + " ja äiti on " + lapsi.getAiti().getNimi());
		
		if (lapsi.getOsoite().equals(lapsi.getAiti().getOsoite()) && lapsi.getOsoite().equals(lapsi.getIsa().getOsoite())) {
			System.out.println("Perhe asuu samassa osoitteessa");
		} else if (lapsi.getOsoite().equals(lapsi.getAiti().getOsoite())) {
			System.out.println("Lapsi ja äiti asuvat samassa osoitteessa");
		} else if (lapsi.getOsoite().equals(lapsi.getIsa().getOsoite())) {
			System.out.println("Lapsi ja isä asuvat samassa osoitteessa");
		}
	}
}
