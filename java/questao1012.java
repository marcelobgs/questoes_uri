package questoes_uri;

import java.util.Scanner;

public class questao1012 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		System.out.printf("TRIANGULO: %.3f\n", (A*C)/2);
		System.out.printf("CIRCULO: %.3f\n", (C*C) * 3.14159);
		System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
		System.out.printf("QUADRADO: %.3f\n", B*B);
		System.out.printf("RETANGULO: %.3f\n", A*B);
		
		
	}

}
