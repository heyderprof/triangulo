package aplicacao;

import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do triângulo A:");
		System.out.print("Base: ");
		double base = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		Triangulo a = new Triangulo(base, altura);
		
		System.out.println("Digite os dados do triângulo B:");
		System.out.print("Base: ");
		base = sc.nextDouble();
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		
		Triangulo b = new Triangulo(base, altura);
		
		System.out.printf("Área do triângulo A: %.2f \n", a.calcularArea());
		System.out.printf("Área do triângulo B: %.2f \n", b.calcularArea());
		
		a.verificarMaiorArea(b.calcularArea());
		
		sc.close();
		
	}

}
