package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelos.Rectangulo;

class TestRectangulo {

	static Rectangulo r1;
	static Rectangulo r2;
	
	@BeforeAll
	static void setup() {
		r1 = new Rectangulo();
		r2 = new Rectangulo(3,2);
	}
	
	@Test
	void areaR1() {
		double areaEsperada=1;
		double areaObtenida=r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void areaR2() {
		double areaEsperada2=6;
		double areaObtenida2=r2.area();
		assertEquals(areaEsperada2, areaObtenida2);
	}
	
	@Test
	void perimetroR1() {
		double perimetroEsperado=4;
		double perimetroObtenido=r1.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	
	@Test
	void perimetroR2() {
		double perimetroEsperado2=10;
		double perimetroObtenido2=r2.perimetro();
		assertEquals(perimetroEsperado2, perimetroObtenido2);
	}
	
	
}
