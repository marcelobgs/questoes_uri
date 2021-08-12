package questoes_uri;

import java.util.Scanner;

public class questao1071 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int soma = 0;
		if (X < Y) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i = Y + 1; i < X; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
	}
}
