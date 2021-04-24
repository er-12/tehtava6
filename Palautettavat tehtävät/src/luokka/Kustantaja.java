package luokka;

public class Kustantaja {
	private String nimi;
	private String osoite;
	private String puhelin;
	
	public Kustantaja(String nimi, String osoite, String puhelin) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.puhelin = puhelin;
	}

	public Kustantaja() {
		nimi = "";
		osoite = "";
		puhelin = "";
	}

	public String getNimi() {
		return nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public String getPuhelin() {
		return puhelin;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}

	@Override
	public String toString() {
		return "Kustantaja [nimi=" + nimi + ", osoite=" + osoite + ", puhelin=" + puhelin + "]";
	}
	
	
}
