package questoes_uri;

import java.util.Scanner;

public class questao1132 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int x, y, soma = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		if (x < y) {
			for (int i = x; i <= y; i++) {
				if (i % 13 != 0)
					soma +=i;
			}
		} else if (x > y) {
			for (int i = y; i <= x; i++) {
				if (i % 13 != 0)
					soma +=i;
			}
		}
		System.out.println(soma);
	}

}
