package questoes_uri;

import java.util.Scanner;

public class questao1079 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

			System.out.printf("%.1f\n", media);
		}

	}

}
