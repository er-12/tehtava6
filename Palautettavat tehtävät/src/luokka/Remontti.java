package luokka;

import java.time.LocalDate;


public class Remontti {
	private int vuosi;
	private String kuvaus;
	private Henkilo tekija;
	
	public Remontti() {
		kuvaus = "";
		vuosi = LocalDate.now().getYear();
		tekija = null;
	}

	public int getVuosi() {
		return vuosi;
	}

	public String getKuvaus() {
		return kuvaus;
	}
	public Henkilo getTekija() {
		return tekija;
	}

	public boolean setVuosi(int vuosi) {
		if (vuosi <= LocalDate.now().getYear()) {
			this.vuosi = vuosi;
			return true;
		} else {
			return false;
		}
		
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public void setTekija(Henkilo tekija) {
		this.tekija = tekija;
	}

	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + "]";
	}

	
	
	
}
