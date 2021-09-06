package questoes_uri;

import java.util.Scanner;

public class questao1117 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double nota1 = sc.nextDouble();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		double nota2 = sc.nextDouble();
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}
		System.out.println("media = " + (nota1 + nota2) / 2);

	}
}
