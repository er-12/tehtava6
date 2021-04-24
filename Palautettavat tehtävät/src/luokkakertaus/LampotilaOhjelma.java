package luokkakertaus;

import java.util.ArrayList;
import java.util.Scanner;

public class LampotilaOhjelma {

	public static void main(String[] args) {
		
		ArrayList<Lampotila> llista = new ArrayList<Lampotila>();
		Scanner input = new Scanner(System.in);
		System.out.print("1. Lisää kpl\n2. Näytä\n0. Lopeta:\n");
		System.out.println("Anna valinta: ");
		int val = input.nextInt();
		input.nextLine();
		while (val != 0) {
			
			if (val == 1) {
				System.out.print("Anna pvm: ");
			    String pvm = input.nextLine();
			    System.out.print("Anna pk: ");
			    String pk = input.nextLine();
			    System.out.print("Anna mittaus: ");
			    double mitta = input.nextDouble();
			    input.nextLine();
			    Lampotila l = new Lampotila(pvm, pk, mitta);
			    llista.add(l);
			    System.out.println("Anna valinta: ");
				val = input.nextInt();
				input.nextLine();
			} else if (val == 2) {
				for (int i = 0; i < llista.size(); i++) {
					System.out.println(llista.get(i).getPvm() + llista.get(i).getPk());
				}
				System.out.println("Anna valinta: ");
				val = input.nextInt();
				input.nextLine();
			} else {
				break;
			}
		}
	}

}
