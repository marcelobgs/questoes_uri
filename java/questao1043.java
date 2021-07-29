package questoes_uri;

import java.util.Scanner;

public class questao1043 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if (a < (b + c) && b < (a + c) && c < (a + b)) {
			System.out.printf("Perimetro = %.1f\n", a + b + c);
		} else {
			System.out.printf("Area = %.1f\n", (a + b) * c / 2);
		}
	}

}
