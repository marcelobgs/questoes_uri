package questoes_uri;

import java.util.Scanner;

public class questao1065 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		int som = 0;
		for (int i = 0; i < 5; i++) {
			a = sc.nextInt();

			if (a % 2 == 0) {
				som++;

			}
		}
		System.out.println(som + " valores pares");
	}

}
