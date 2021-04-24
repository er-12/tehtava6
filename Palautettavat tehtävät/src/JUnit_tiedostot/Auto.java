package yleinen;

import java.util.Calendar;

public class Auto {
	private String rekno, merkki, malli;
	private int vuosi;
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auto(String rekno, String merkki, String malli, int vuosi) {
		super();
		this.rekno = rekno;
		this.merkki = merkki;
		this.malli = malli;
		this.vuosi = vuosi;
	}
	public String getRekno() {
		return rekno;
	}
	public void setRekno(String rekno) {
		this.rekno = rekno;
	}
	public String getMerkki() {
		return merkki;
	}
	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	public String getMalli() {
		return malli;
	}
	public void setMalli(String malli) {
		this.malli = malli;
	}
	public int getVuosi() {
		return vuosi;
	}
	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	public int laskeIka() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year-this.vuosi;
	}
	@Override
	public String toString() {
		return "Auto [rekno=" + rekno + ", merkki=" + merkki + ", malli=" + malli + ", vuosi=" + vuosi + "]";
	}
	
}
