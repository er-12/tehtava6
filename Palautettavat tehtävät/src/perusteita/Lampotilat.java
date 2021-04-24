package perusteita;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX = 100;
		int[] lampt = new int[MAX];
		int lkm = 0;
		System.out.print("Anna lämpötila: ");
		int lam = input.nextInt();
		
		while (lam != -999 && lkm < MAX) {
			lampt[lkm] = lam;
			lkm++;
			if (lkm < MAX) {
				System.out.print("Anna lämpötila: ");
				lam = input.nextInt();
			}
		}
		Arrays.sort(lampt, 0, lkm);
		System.out.print("Annoit lämpötilat: ");
		for (int i = 0; i < lkm; i++) {
			System.out.print(lampt[i] + " ");
		}

	}

}
