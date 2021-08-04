package questoes_uri;

import java.util.Scanner;

public class questao1051 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double salario = sc.nextDouble();

		if (salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario >= 2000.01 && salario <= 3000.00) {
			System.out.printf("R$ %.2f\n", ((salario - 2000.00) * 0.8));
		} else if (salario >= 3000.01 && salario <= 4500.00) {
			System.out.printf("R$ %.2f\n", ((salario - 3000) * 0.18) + 80);
		} else if (salario > 4500.00) {
			System.out.printf("R$ %.2f\n", ((salario - 4500) * 0.28) + 350);
		}
	}

}
