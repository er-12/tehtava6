package luokkakertaus;

import java.util.ArrayList;

public class Esittaja {
	private String nimi;
	private int ika;
	private ArrayList<Kappale> kplt = null;
	
	public Esittaja(String nimi, int ika) {
		this.nimi = nimi;
		this.ika = ika;
		kplt = new ArrayList<Kappale>();
		Kappale kpl = new Kappale();
		kplt.add(kpl);
	}
	public Esittaja() {
		nimi = "";
		ika = 0;
		kplt = new ArrayList<Kappale>();
	}
	public String getNimi() {
		return nimi;
	}
	public int getIka() {
		return ika;
	}
	public ArrayList<Kappale> getKplt() {
		return kplt;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public void setIka(int ika) {
		this.ika = ika;
	}
	public void setKplt(ArrayList<Kappale> kplt) {
		this.kplt = kplt;
	}
	@Override
	public String toString() {
		return "Esittaja [nimi=" + nimi + ", ika=" + ika + ", kplt=" + kplt + "]";
	}
	
	
}
