package perusteita;

public class Lintu {
	private String laji;
	private int maara;
	
	public Lintu(String laji, int maara) {
		this.laji = laji;
		this.maara = maara;
	}
	public Lintu() {
		laji = "";
		maara = 0;
	}
	public String getLaji() {
		return laji;
	}
	public int getMaara() {
		return maara;
	}
	public void setLaji(String laji) {
		this.laji = laji;
	}
	public void setMaara(int maara) {
		this.maara = maara;
	}
	public void lisaa() {
		this.maara = this.maara + 1;
	}
	
	@Override
	public String toString() {
		return "Lintu [laji=" + laji + ", maara=" + maara + "]";
	}
	
	
}
