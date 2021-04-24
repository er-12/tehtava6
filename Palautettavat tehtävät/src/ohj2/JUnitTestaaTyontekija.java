package ohj2;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestaaTyontekija {

	
	@Test
	public void testGetTuntipalkka() {
		Tyontekija t = new Tyontekija();
		t.setTuntipalkka(15.0);
		assertEquals(15.0, t.getTuntipalkka(), 0.01);
	}
	@Test
	public void testGetNimi() {
		Tyontekija t = new Tyontekija();
		t.setNimi("Matti Korhonen");
		assertEquals("Matti Korhonen", t.getNimi());
	}
	
	@Test
	public void testGetOsoite() {
		Tyontekija t = new Tyontekija();
		t.setOsoite("Helsinki");
		assertEquals("Helsinki", t.getOsoite());
	}
	
	@Test
	public void testGetKoko() {
		Tyontekija t = new Tyontekija();
		Koko k = new Koko();
		k.setPituus(1.80);
		k.setPaino(80);
		t.setKoko(k);
		assertEquals(k, t.getKoko());
	}
	
}
