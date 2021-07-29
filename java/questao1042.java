package questoes_uri;

import java.util.Scanner;

public class questao1042 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int x, y, z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		if ((x >= y) && (y >= z)) {
			System.out.print(z + "\n" + y + "\n" + x + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if ((x <= y) && (y <= z)) {
			System.out.print(x + "\n" + y + "\n" + z + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if ((x >= z) && (z >= y)) {
			System.out.print(y + "\n" + z + "\n" + x + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if ((x <= z) && (z <= y)) {
			System.out.print(x + "\n" + z + "\n" + y + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if ((z <= x) && (x <= y)) {
			System.out.print(z + "\n" + x + "\n" + y + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if ((y <= x) && (x <= z)) {
			System.out.print(y + "\n" + x + "\n" + z + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}
	}
}
