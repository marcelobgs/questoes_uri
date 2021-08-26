package questoes_uri;

import java.util.Scanner;

public class questao1113 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int X = sc.nextInt();
		int Y = sc.nextInt();
		while (X != Y) {

			if (X > Y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
	}

}
