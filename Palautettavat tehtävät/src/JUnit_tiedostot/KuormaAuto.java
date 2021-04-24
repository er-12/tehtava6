package yleinen;

public class KuormaAuto extends Auto {
	private int kantavuus;

	public KuormaAuto() {
		super();		
	}

	public KuormaAuto(String rekno, String merkki, String malli, int vuosi) {
		super(rekno, merkki, malli, vuosi);		
	}

	public int getKantavuus() {
		return kantavuus;
	}

	public void setKantavuus(int kantavuus) {
		this.kantavuus = kantavuus;
	}

	@Override
	public String toString() {
		return "KuormaAuto [kantavuus=" + kantavuus + ", getRekno()=" + getRekno() + ", getMerkki()=" + getMerkki()
				+ ", getMalli()=" + getMalli() + ", getVuosi()=" + getVuosi() + "]";
	}
	
	
}
