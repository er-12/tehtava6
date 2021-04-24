package luokkakertaus;

public class Lampotila {
	private String pvm;
	private String pk;
	private double mitta;
	
	public Lampotila(String pvm, String pk, double mitta) {
		
		this.pvm = pvm;
		this.pk = pk;
		this.mitta = mitta;
	}
	public Lampotila() {
		
		pvm = "";
		pk = "";
		mitta = 0.0;
	}
	public String getPvm() {
		return pvm;
	}
	public String getPk() {
		return pk;
	}
	public double getMitta() {
		return mitta;
	}
	public void setPvm(String pvm) {
		this.pvm = pvm;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public void setMitta(double mitta) {
		this.mitta = mitta;
	}
	@Override
	public String toString() {
		return "Lampotila [pvm=" + pvm + ", pk=" + pk + ", mitta=" + mitta + "]";
	}
	

}
