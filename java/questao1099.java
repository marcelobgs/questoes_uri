package questoes_uri;

import java.util.Scanner;

public class questao1099 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int X, Y, soma;
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			soma = 0;
			X = sc.nextInt();
			Y = sc.nextInt();

			if (Y > X) {
				for (int j = X + 1; j < Y; j++) {
					if (j % 2 != 0)
						soma += j;

				}
			} else {
				for (int j = Y + 1; j < X; j++) {
					if (j % 2 != 0)
						soma += j;

				}

			}
			System.out.println(soma);
		}

	}

}
