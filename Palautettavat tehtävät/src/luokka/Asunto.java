package luokka;

import java.util.ArrayList;

public class Asunto {
	private String tyyppi;
	private String osoite;
	private double pintaala;
	private double hinta;
	private String kuvaus;
	private ArrayList<Remontti> remonttiLista;
	
	public Asunto(String tyyppi, String osoite, double pintaala, double hinta, String kuvaus,
			ArrayList<Remontti> remonttiLista) {
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaala = pintaala;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
		this.remonttiLista = new ArrayList<Remontti>();
	}
	public Asunto(String tyyppi, String osoite, double pintaala, double hinta, String kuvaus) {
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaala = pintaala;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
	}
	
	public Asunto() {
		tyyppi = "";
		osoite = "";
		pintaala = 0.0;
		hinta = 0.0;
		kuvaus = "";
		remonttiLista = new ArrayList<Remontti>();
	}
	public ArrayList<Remontti> getRemonttiLista() {
		return remonttiLista;
	}
	public void setRemonttiLista(Remontti rem) {
		this.remonttiLista.add(rem);
	}
	public String getTyyppi() {
		return tyyppi;
	}
	public String getOsoite() {
		return osoite;
	}
	public double getPintaala() {
		return pintaala;
	}
	public double getHinta() {
		return hinta;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public void setPintaala(double pintaala) {
		this.pintaala = pintaala;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", pintaala=" + pintaala + ", hinta=" + hinta
				+ ", kuvaus=" + kuvaus + ", remonttiLista=" + remonttiLista + "]";
	}
	
}
