package yleinen;

public class TeeAuto {

	public static void main(String[] args) {
		Auto a = new Auto();
		a.setMerkki("Audi");
		a.setMalli("A4");
		System.out.println(a);
		KuormaAuto b = new KuormaAuto();
		b.setMerkki("Volvo");
		b.setKantavuus(10000);
		System.out.println(b);		
	}
}
