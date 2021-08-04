package questoes_uri;

import java.util.Scanner;

public class questao1047 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int inicio = sc.nextInt();
		int minInicio = sc.nextInt();
		int termino = sc.nextInt();
		int minTermino = sc.nextInt();
		int resuHora, resuMin;

		resuHora = termino - inicio;

		if (resuHora < 0) {
			resuHora = 24 + (termino - inicio);
		}
		resuMin = minTermino - minInicio;

		if (resuMin < 0) {
			resuMin = 60 + (minTermino - minInicio);
			resuHora--;
		}

		if (inicio == termino && minInicio == minTermino) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else
			System.out.println("O JOGO DUROU " + resuHora + " HORA(S) E " + resuMin + " MINUTO(S)");
	}
}
