package luokka;



public class Peli {
	private int arvattava;
	private int arvauksia;
	private boolean valmis;
	private Henkilo pelaaja;
	
	public Peli(int arvattava, int arvauksia, boolean valmis, Henkilo pelaaja) {
		this.arvattava = 73;
		this.arvauksia = arvauksia;
		this.valmis = valmis;
		this.pelaaja = pelaaja;
	}
	public Peli() {
		arvattava = 0;
		arvauksia = 0;
		valmis = false;
		pelaaja = null;
	}

	public int getArvattava() {
		return arvattava;
	}

	public int getArvauksia() {
		return arvauksia;
	}

	public boolean isValmis() {
		return valmis;
	}

	public Henkilo getPelaaja() {
		return pelaaja;
	}

	public void setArvattava(int arvattava) {
		this.arvattava = arvattava;
	}

	public void setArvauksia(int arvauksia) {
		this.arvauksia = arvauksia;
	}

	public void setValmis(boolean valmis) {
		this.valmis = valmis;
	}

	public void setPelaaja(Henkilo pelaaja) {
		this.pelaaja = pelaaja;
	}

}
