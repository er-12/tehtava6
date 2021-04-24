package yleinen;

public class Funktioita {
	public int laskeMerkit(String sana, String merkki) {
		sana = sana.toUpperCase().trim();
		merkki = merkki.toUpperCase().trim();
		int pituus = sana.length();
		sana = sana.replace(merkki, "");
		return pituus-sana.length();
	}		
}
