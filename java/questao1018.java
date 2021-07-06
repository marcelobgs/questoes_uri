package questoes_uri;

import java.util.Scanner;

public class questao1018 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int valor = sc.nextInt();
		int atual = valor;
		int notas100 = atual / 100;
		atual = atual - notas100 * 100;
		int notas50 = atual / 50;
		atual = atual - notas50 * 50;
		int notas20 = atual / 20;
		atual = atual - notas20 * 20;
		int notas10 = atual / 10;
		atual = atual - notas10 * 10;
		int notas5 = atual / 5;
		atual = atual - notas5 * 5;
		int notas2 = atual / 2;
		atual = atual - notas2 * 2;
		int notas1 = atual;

		System.out.println(valor);
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");
	}

}
