

package perusteita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class kertaus5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.0");
		int vkp = 1;
		int[] numerot = new int[7]; 
		String[] vkpt = {"ma", "ti", "ke", "to", "pe", "la", "su"};
		int i = 0;
		while (vkp <= 7) {
			System.out.print("Anna " + vkpt[i] + " lämpötila: ");
			int lmp = input.nextInt();
			input.nextLine();
			numerot[i] = lmp;
			i++;
			vkp++;
		}
		int p = numerot[0];
		int s = numerot[0];
		double yht = 0;
		for (i = 0; i < numerot.length; i++) {
			yht = yht + numerot[i];
			if (numerot[i] <= p) {
				p = numerot[i];
			}
			if (numerot[i] >= s) {
				s = numerot[i];
			}
		}
		double ka = yht / 7;
		System.out.println("Pienin: " + des.format(p)); 
		System.out.println("Suurin " + des.format(s));
		System.out.println("Ka " + des.format(ka));
	}

}