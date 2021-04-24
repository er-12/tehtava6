package luokka;

public class Pelaaja {
	private String nimi;
	private int pisteet;
	private int laanit;
	
	public Pelaaja(String nimi, int pisteet) {
		this.nimi = nimi;
		this.pisteet = pisteet;
		
	}

	public Pelaaja() {
	}

	public Pelaaja(String nimi) {
		this.nimi = nimi;
	}
	
	public Pelaaja(int pisteet) {
		this.pisteet = pisteet;
	}
	

	public String getNimi() {
		return nimi;
	}

	public int getPisteet() {
		return pisteet;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setPisteet(int pisteet) {
		this.pisteet = pisteet;
	}

	@Override
	public String toString() {
		return "Pelaaja [nimi=" + nimi + ", pisteet=" + pisteet + "]";
	}
	
}
