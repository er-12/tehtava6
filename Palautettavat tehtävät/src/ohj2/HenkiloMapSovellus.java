package ohj2;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HenkiloMapSovellus {
	
	private Lukija lukija = new Lukija();
	private HashMap<String, Henkilo> henkilot = new HashMap<String, Henkilo>();
	
	public HenkiloMapSovellus(){
		naytaValikko();
	}
	
	private void naytaValikko() {
		System.out.println("1. Lisää henkilö");
		System.out.println("2. Näytä henkilön tiedot");
		System.out.println("3. Muuta henkilön nimi ja osoite");
		System.out.println("4. Muuta henkilön koko");
		System.out.println("5. Näytä kaikki henkilöt");
		System.out.println("0. Lopetus");
		switch (lukija.lueKokonaisluku("Anna valintasi (0-5): ")) {
		case 1:
			lisaaHenkilo();
			break;
		case 2:
			etsiHenkilo();
			break;
		case 3:
			muutaHenkilo();
			break;
		case 4:
			muutaKoko();
			break;
		case 5:
			tulostaKaikki();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("Väärä valinta!");
			break;
		}
		naytaValikko();
	}

	private void lisaaHenkilo() {
		Henkilo henkilo = new Henkilo();
		Koko koko = new Koko();
		henkilo.setNimi(lukija.lueTeksti("Anna nimi: "));
		if(henkilot.containsKey(henkilo.getNimi())){
			System.out.println("Olet jo lisännyt tämän henkilön");
			return;
		}
		henkilo.setOsoite(lukija.lueTeksti("Anna osoite: "));
		koko.setPituus(lukija.lueDesimaaliluku("Anna pituus: "));
		koko.setPaino(lukija.lueKokonaisluku("Anna paino: "));
		henkilo.setKoko(koko);
		henkilot.put(henkilo.getNimi(), henkilo);
		
	}

	private void etsiHenkilo() {
		DecimalFormat des = new DecimalFormat("0.00");
		String nimi = lukija.lueTeksti("Anna näytettävän henkilön nimi: ");
		if(henkilot.containsKey(nimi)){
			System.out.println("Nimi: " + henkilot.get(nimi).getNimi() + "\nOsoite: " + henkilot.get(nimi).getOsoite() + "\nPituus: " + des.format(henkilot.get(nimi).getKoko().getPituus()) + "\nPainoindeksi: " + des.format(henkilot.get(nimi).getKoko().getPainoindeksi()));
		} else {
			System.out.println("Henkilöä ei ole");
		}		
	}

	private void muutaHenkilo() {
		String nimi = lukija.lueTeksti("Anna perustietoja muutettavan henkilön nimi: ");
		Henkilo henkilo = new Henkilo();
		Koko koko = new Koko();
		if(henkilot.containsKey(nimi)){
			henkilo.setNimi(lukija.lueTeksti("Anna nimi: "));
			henkilo.setOsoite(lukija.lueTeksti("Anna osoite: "));
			koko = henkilot.get(nimi).getKoko();
			henkilo.setKoko(koko);
			henkilot.put(henkilo.getNimi(), henkilo);
			henkilot.remove(nimi);
		} else {
			System.out.println("Henkilöä ei ole");
		}
	}
	
	private void muutaKoko() {
		Koko koko = new Koko();
		String nimi = lukija.lueTeksti("Anna kokoa muutettavan henkilön nimi: ");
		if(henkilot.containsKey(nimi)){
			koko.setPituus(lukija.lueDesimaaliluku("Anna pituus: "));
			koko.setPaino(lukija.lueKokonaisluku("Anna paino: "));
			
			Henkilo henkilo = new Henkilo(henkilot.get(nimi).getNimi(), henkilot.get(nimi).getOsoite(), koko);
			henkilot.replace(nimi, henkilo);
		} else {
			System.out.println("Henkilöä ei ole");
		}
	}

	private void tulostaKaikki() {
		DecimalFormat des = new DecimalFormat("0.00");
		Set<String> nimet= henkilot.keySet();
		Iterator<String> i = nimet.iterator();
		
		while (i.hasNext()) { 
			String key = i.next();
			System.out.println("Nimi: " + henkilot.get(key).getNimi() + "\nOsoite: " + henkilot.get(key).getOsoite() + "\nPituus: " + des.format(henkilot.get(key).getKoko().getPituus()) +  "\nPainoindeksi: " + des.format(henkilot.get(key).getKoko().getPainoindeksi()) + "\n");
		}		
	}
	public static void main(String[] args) {
		new HenkiloMapSovellus();

	}

}



	

