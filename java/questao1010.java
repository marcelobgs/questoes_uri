package questoes_uri;

import java.util.Scanner;

public class questao1010 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int codPeca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		int codPeca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (numeroPeca1*valorPeca1) + (numeroPeca2*valorPeca2));

	}

}
