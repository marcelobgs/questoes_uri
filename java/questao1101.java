package questoes_uri;

import java.util.Scanner;

public class questao1101 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int soma = 0;
		int M = sc.nextInt();
		int N = sc.nextInt();
		while (M > 0 && N > 0) {

			if (M > N) {
				for (int i = N; i <= M; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			} else {
				for (int i = M; i <= N; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			}
			System.out.println("Sum=" + soma);
			M = sc.nextInt();
			N = sc.nextInt();
			soma = 0;
		}
	}

}
