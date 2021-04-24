/*Toistorakenne:Ilmalämpöpumppusäästäävuodessapientalossakeskimäärin3000 kWh/vuosi.
 *  Tee ohjelma, joka kertoo säästötavoitteen toteutumisen vuosittain,
 *   kunnes investointi on maksettu. 
 *   Ohjelma kysyy lämpöpumpun hinnan sekä sähkön hinnan/kWh.
 */
package perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class kertaus3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.print("Anna ilmapumpun hinta: ");
		int h = input.nextInt();
		input.nextLine();
		System.out.print("Anna sähkön hinta /kwh: ");
		double h2 = input.nextDouble();
		input.nextLine();
		double vuodessa = 3000 * h2 / 100;
		double yhteensa = 0.0;
		int vuosia = 0;
		while (yhteensa < h) {
			yhteensa = yhteensa + vuodessa;
			vuosia ++;
			System.out.println(vuosia + ". säästetty " + desimaalit.format(yhteensa));
		}
		
		System.out.println("Maksaminen kesti " + vuosia + " vuotta.");

	}

}