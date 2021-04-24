package perusteita;

public class Henkilo {
	private String nimi;
	private String osoite;
	private Henkilo aiti;
	private Henkilo isa;
	
	public Henkilo(String nimi, String osoite, Henkilo aiti, Henkilo isa) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.aiti = aiti;
		this.isa = isa;
	}
	public Henkilo() {
		nimi = "";
		osoite = "";
		aiti = null;
		isa = null;
	}
	public String getNimi() {
		return nimi;
	}
	public String getOsoite() {
		return osoite;
	}
	public Henkilo getAiti() {
		return aiti;
	}
	public Henkilo getIsa() {
		return isa;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public void setAiti(Henkilo aiti) {
		this.aiti = aiti;
	}
	public void setIsa(Henkilo isa) {
		this.isa = isa;
	}
	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", aiti=" + aiti + ", isa=" + isa + "]";
	}
	
	
}
