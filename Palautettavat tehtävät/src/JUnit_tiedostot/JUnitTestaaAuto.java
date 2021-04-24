package yleinen;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class JUnitTestaaAuto {

	@Test
	public void testSetRekno() {
		Auto a = new Auto();
		a.setRekno("ABC-123");
		assertEquals("ABC-123", a.getRekno());
	}

	@Test
	public void testSetMalli() {
		Auto a = new Auto();
		a.setMalli("A4");
		assertEquals("A4", a.getMalli());
	}
	
	@Test
	public void testSetMalliSetMerkki() {
		Auto a = new Auto();
		a.setMerkki("Audi");
		a.setMalli("A4");
		assertEquals("Audi A4", a.getMerkki() + " " + a.getMalli());
	}

	@Test
	public void testLaskeIka() {
		Auto a = new Auto();
		int asetaVuosi = 2000;
		int tamaVuosi = Calendar.getInstance().get(Calendar.YEAR);
		int ika = tamaVuosi-asetaVuosi;
		a.setVuosi(asetaVuosi);
		assertEquals(ika, a.laskeIka());
	}

}
