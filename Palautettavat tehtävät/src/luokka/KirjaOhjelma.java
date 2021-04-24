package luokka;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Anna nimi: ");
	    String nimi = input.nextLine();
	    System.out.print("Anna isbn: ");
	    String isbn = input.nextLine();
	    System.out.print("Anna hinta: ");
	    double hinta = input.nextDouble();
	    System.out.print("Anna julkaisuvuosi: ");
	    int jv = input.nextInt();

	    System.out.println();
		Kirja kirja2 = new Kirja(nimi, isbn, hinta, jv, null);
	    System.out.println(kirja2.toString());
	    
	    Kirja kirja = new Kirja();
	    kirja.setNimi(nimi);
	    kirja.setIsbn(isbn);
	    kirja.setHinta(hinta);
	    kirja.setJulkaisuvuosi(jv);
	    System.out.println();
	    DecimalFormat des = new DecimalFormat("0.00");
	    System.out.println("Nimi: " + kirja.getNimi() +
                "\nIsbn: " + kirja.getIsbn() + 
                "\nHinta: " + des.format(kirja.getHinta()) +
                "\nJulkaisuvuosi: " + kirja.getJulkaisuvuosi());
	}

}
