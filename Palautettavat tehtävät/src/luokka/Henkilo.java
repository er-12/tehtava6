package luokka;

public class Henkilo {
	private String nimi;
	private String osoite;
	
	public Henkilo(String nimi, String osoite) {
		
		this.nimi = nimi;
		this.osoite = osoite;
	}

	public Henkilo() {
		nimi = "";
		osoite = "";
	}

	public String getNimi() {
		return nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setOs(String osoite) {
		this.osoite = osoite;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", os=" + osoite + "]";
	}
	
	
}

