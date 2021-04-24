package luokkakertaus;

public class Henkilo {
	private String nimi;
	private String osoite;
	private Auto auto;
	
	public Henkilo(String nimi, String osoite, Auto auto) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.auto = null;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public Henkilo() {
		nimi = "";
		osoite = "";
		auto = null;
	}


	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", auto=" + auto + "]";
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

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
}
