package questoes_uri;

import java.util.Scanner;

public class questao1115 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != 0 || Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else if (X > 0 && Y < 0) {
				System.out.println("quarto");
			}

			X = sc.nextInt();
			Y = sc.nextInt();

		}

	}

}
