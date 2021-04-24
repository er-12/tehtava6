/*Taulukko:Teeohjelma,jokakertoopuolenvuodenajaltakuukausittaisen 
 * vedenkulutuksen. Ohjelma kysyy aluksi vesimittarin alkulukeman ja
 *  sen jälkeen kuuden kuukauden vesimittaritlukemat. Lopuksi ohjelma näyttäa
 *  ̈ kunkin kuukauden kulutuksen.*/
 
package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class kertaus6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.0");
		int vkp = 1;
		int[] numerot = new int[7]; 
		String[] vkpt = {"1", "2", "3", "4", "5", "6"};
		int i = 1;
		System.out.print("Anna alkulukema: ");
		int lmp = input.nextInt();
		numerot[0] = lmp;
		input.nextLine();
		while (vkp <= 6) {
			System.out.print("Anna " + vkpt[i - 1] + ". lämpötila: ");
			int kkl = input.nextInt();
			input.nextLine();
			numerot[i] = kkl;
			i++;
			vkp++;
		}
		int j = 0;
		for (i = 1; i < numerot.length; i++) {
			System.out.println("Kuukauden " + vkpt[j] + " oli " + (numerot[i] - numerot[i-1]));
			j++;
		}
	}
	}