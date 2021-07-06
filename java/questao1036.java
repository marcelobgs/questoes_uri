package questoes_uri;

import java.util.Scanner;

public class questao1036 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double bascara = Math.sqrt((B * B) - (4 * A * C));
		double R1 = (-B + bascara) / (2 * A);
		double R2 = (-B - bascara) / (2 * A);

		if (A == 0 || (B * B - 4 * A * C < 0))
			System.out.println("Impossivel calcular");
		else {
			System.out.println(String.format("R1 = %.5f", R1));
			System.out.println(String.format("R2 = %.5f", R2));
		}
	}

}
