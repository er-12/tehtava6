package luokkakertaus;
import java.util.Scanner;

public class KplOhjelma {
	
	private void lisaakpl() {
		
	}
	private void lisaaes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna nimi: ");
	    String nimi = input.nextLine();
	    
	    System.out.print("Anna vuosi: ");
	    int vuosi = input.nextInt();
	    input.nextLine();
	    Esittaja es = new Esittaja(nimi, vuosi);
	    
	}
	private void nayta() {
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		KplOhjelma o = new KplOhjelma();
		System.out.print("1.Lisää kpl\n2.Lisaa es\n3.näytä:\n");
		System.out.println("Anna valinta: ");
		int val = input.nextInt();
		while (val != 0) {
			
			if (val == 1) {
				o.lisaakpl();
			} else if (val == 2) {
				o.lisaaes();
			} else {
				o.nayta();
				break;
			}
	}

}
