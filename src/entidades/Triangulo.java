package entidades;

public class Triangulo {
	
	private double base;
	private double altura;
	
	public Triangulo() {

	}
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base * altura;
	}
	
	public void verificarMaiorArea(double area) {
		if (this.calcularArea() > area) {
			System.out.println("O triângulo A tem a maior área");
		} else {
			System.out.println("O triângulo B tem a maior área");
		}
	}
	

}
