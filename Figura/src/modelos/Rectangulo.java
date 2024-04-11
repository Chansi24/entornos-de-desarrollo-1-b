 package modelos;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	
	/**
	 * Constructor por defecto. Crea un rectangulo con base y altura 1, en metros.
	 */
	public Rectangulo() {
		this.base=1;
		this.altura=1;
	}
	/**
	 * Constructor que recibe como paramentros la base y la altura del rectangulo, en metros
	 * 
	 * @param base   la base del rectangulo, en metros
	 * @param altura la alutra del rectangulo, en metros
	 */
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	/**
	 * @see modelos.Figura#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * altura;
	}
	
	/**
	 * @see modelos.Figura#perimetro()
	 */
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*base + 2*altura;
	} 

}
