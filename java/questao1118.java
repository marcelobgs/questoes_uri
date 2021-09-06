package questoes_uri;

import java.util.Scanner;

public class questao1118 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int aux = 1;

		while (aux == 1) {
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
			System.out.println(String.format("media = %.2f", (nota1+nota2)/2));
			System.out.println("novo calculo (1-sim 2-nao)");
			aux = sc.nextInt();
			while (aux!= 1 && aux != 2) {
				System.out.println("1-sim 2-nao");
				aux = sc.nextInt();
			}

		}

	}

}
