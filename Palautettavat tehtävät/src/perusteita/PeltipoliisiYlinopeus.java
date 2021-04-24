package perusteita;

public class PeltipoliisiYlinopeus {

	public static void main(String[] args) {
		String[] peltipoliisi = {"ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83"};
		
		for (int i = 0; i < peltipoliisi.length; i++) {
			String osa = peltipoliisi[i].split(";")[1];
			int n = Integer.parseInt(osa);
			if (n >= 84) {
				System.out.println(peltipoliisi[i].split(";")[0] + " " + n);
			}
		}
	}

}
