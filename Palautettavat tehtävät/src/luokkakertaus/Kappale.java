package luokkakertaus;

public class Kappale {
	private String nimi;
	private int kesto;
	private int vuosi;
	
	public Kappale(String nimi, int kesto, int vuosi) {
		this.nimi = nimi;
		this.kesto = kesto;
		this.vuosi = vuosi;
	}
	public Kappale() {
		nimi = "";
		kesto = 0;
		vuosi = 0;
	}
	public String getNimi() {
		return nimi;
	}
	public int getKesto() {
		return kesto;
	}
	public int getVuosi() {
		return vuosi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public void setKesto(int kesto) {
		this.kesto = kesto;
	}
	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	@Override
	public String toString() {
		return "Kappale [nimi=" + nimi + ", kesto=" + kesto + ", vuosi=" + vuosi + "]";
	}
	
}
