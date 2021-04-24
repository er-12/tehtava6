package luokka;

public class Kirja {
	private String nimi;
	private String isbn;
	private double hinta;
	private int julkaisuvuosi;
	private Kustantaja k;
	
	
	public Kirja() {
		nimi = "";
		isbn = "";
		hinta = 0.0;
		julkaisuvuosi = 0;
		k = null;
	}

	public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi, Kustantaja k) {
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.julkaisuvuosi = julkaisuvuosi;
		this.k = k;
	}


	public String getNimi() {
		return nimi;
	}
	public String getIsbn() {
		return isbn;
	}
	public double getHinta() {
		return hinta;
	}
	public int getJulkaisuvuosi() {
		return julkaisuvuosi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public void setJulkaisuvuosi(int julkaisuvuosi) {
		this.julkaisuvuosi = julkaisuvuosi;
	}
	public Kustantaja getK() {
		return k;
	}
	public void setK(Kustantaja k) {
		this.k = k;
	}
	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", julkaisuvuosi=" + julkaisuvuosi
				+ ", k=" + k + "]";
	}
	
	
}
