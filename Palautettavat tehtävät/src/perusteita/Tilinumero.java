package perusteita;

import java.util.Scanner;

public class Tilinumero {

	public String kysyNro() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna tilinumero: ");
		String tilinro = input.nextLine();
		return tilinro;
	}
	public boolean tarkistaNro(String tilinro) {
		
		if (tilinro.matches("FI\\d{16}")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Tilinumero ohj = new Tilinumero();
		String tnro = ohj.kysyNro();
		boolean vastaus = ohj.tarkistaNro(tnro);
		if (vastaus == true) {
			System.out.println("On suomalainen tilinumero");
		} else {
			System.out.println("Ei ole suomalainen tilinumero");
		}
		
	}

}
