package ohj2;



public class TyontekijaOhjelma {
	
	private Lukija lukija = new Lukija();
	
	public TyontekijaOhjelma() {
		lisaaTyontekija();
	}
	
	private void lisaaTyontekija() {
		Tyontekija tk = new Tyontekija();
		
		tk.setNimi(lukija.lueTeksti("Anna nimi: "));
		tk.setOsoite(lukija.lueTeksti("Anna osoite: "));
		tk.setTuntipalkka(lukija.lueDesimaaliluku("Anna tuntipalkka: "));
		
		System.out.println("\nNimi: " + tk.getNimi() + "\nOsoite: " + tk.getOsoite() + "\nTuntipalkka: " + tk.getTuntipalkka());
		
		
	}
	

	public static void main(String[] args) {
		new TyontekijaOhjelma();
		
	}

}
