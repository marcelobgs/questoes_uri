package questoes_uri;

import java.util.Scanner;

public class questao1133 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if (X < Y) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 5 == 2 || i % 5 == 3)
					System.out.println(i);
			}

		} else {
			for (int i = Y + 1; i < X; i++) {
				if (i % 5 == 2 || i % 5 == 3)
					System.out.println(i);
			}
		}

	}

}
