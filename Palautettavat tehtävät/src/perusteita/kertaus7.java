package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class kertaus7 {
	
	public double kysyJaLaskePainot() {
		Scanner input = new Scanner(System.in);
		kertaus7 ohjelma = new kertaus7();
		double yht = 0.0;
		double paino = 0.0;
		while (paino != -1) {
		System.out.print("Anna paino (-1 lop): ");
		paino = input.nextDouble();
		input.nextLine();
			if (paino != -1) {
			yht = yht + paino;
			}
			}
		
		return yht;
		}
		
	
	
	public void naytaPostituskulut(double yhteispaino) {
		DecimalFormat des = new DecimalFormat("0.00");
		double kulut = 0.0;
		if (yhteispaino > 0 && yhteispaino < 20) {
			kulut = 8.10;
		} else if (yhteispaino >= 20 && yhteispaino < 100) {
			kulut = 14.00;
		} else {
			kulut = 19.00;
		}
		System.out.println("yhteispaino " + yhteispaino);
		System.out.println("kulut " + des.format(kulut) + " euroa");
	
	}
	
	public static void main(String[] args) {
		kertaus7 ohjelma = new kertaus7();
		Scanner input = new Scanner(System.in);
		
		double yhteispaino = ohjelma.kysyJaLaskePainot();
		ohjelma.naytaPostituskulut(yhteispaino);
	}

}