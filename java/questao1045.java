package questoes_uri;

import java.util.Scanner;

public class questao1045 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double maior;

		if (B > A && B > C) {
			maior = B;
			B = A;
			A = maior;
		} else if (C > A && C > B) {
			maior = C;
			C = A;
			A = maior;
		}

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((A * A) == (B * B) + (C * C))
				System.out.println("TRIANGULO RETANGULO");
			if ((A * A) > (B * B) + (C * C))
				System.out.println("TRIANGULO OBTUSANGULO");
			if ((A * A) < (B * B) + (C * C))
				System.out.println("TRIANGULO ACUTANGULO");
			if ((A == B && B == C && A == C))
				System.out.println("TRIANGULO EQUILATERO");
			if((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
				System.out.println("TRIANGULO ISOSCELES");
		}

	}
}
