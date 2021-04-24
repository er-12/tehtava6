package luokkakertaus;

import java.time.LocalDate;

public class Auto {

	private String malli;
	private String merkki;
	private String reknro;
	private int vuosi;
	
	public Auto(String malli, String merkki, String reknro, int vuosi) {
		super();
		this.malli = malli;
		this.merkki = merkki;
		this.reknro = reknro;
		this.vuosi = vuosi;
	}

	public Auto() {
		malli = "";
		merkki = "";
		reknro = "";
		vuosi = 0;
	}

	public String getMalli() {
		return malli;
	}

	public String getMerkki() {
		return merkki;
	}

	public String getReknro() {
		return reknro;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public void setReknro(String reknro) {
		this.reknro = reknro;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	public int getIka() {
		int nyt = LocalDate.now().getYear();
		int ika = nyt - this.vuosi;
		return ika;
	}
	@Override
	public String toString() {
		return "Auto [malli=" + malli + ", merkki=" + merkki + ", reknro=" + reknro + ", vuosi=" + vuosi + "]";
	}
	
	

}
