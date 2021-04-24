package yleinen;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestaaFunktioita {

	@Test
	public void test() {
		Funktioita f = new Funktioita();
		assertEquals(3, f.laskeMerkit("Hollywood", "o"));
	}
	
	@Test
	public void test2() {
		Funktioita f = new Funktioita();
		assertTrue(f.laskeMerkit("Hollywood", "o")==3);
	}

}
