package questoes_uri;

import java.util.Scanner;

public class questao1046 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int inicio = sc.nextInt();
		int termino = sc.nextInt();

		int resu = termino - inicio;
		if (resu < 0)
			resu = 24 + (termino - inicio);
		if (inicio == termino) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else 
			System.out.println("O JOGO DUROU " + resu + " HORA(S)");
	}

}
