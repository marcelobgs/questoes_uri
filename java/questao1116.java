package questoes_uri;

import java.util.Scanner;

public class questao1116 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0)
				System.out.println("divisao impossivel");
			else
				System.out.println((double) x/y);
		}

	}

}
