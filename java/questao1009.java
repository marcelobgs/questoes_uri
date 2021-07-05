package questoes_uri;

import java.util.Scanner;

public class questao1009 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double vendasMes = sc.nextDouble();

		System.out.printf("TOTAL = R$ %.2f\n", (salarioFixo + (vendasMes * 0.15)));

	}

}
