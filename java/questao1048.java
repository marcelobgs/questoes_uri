package questoes_uri;

import java.util.Scanner;

public class questao1048 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double salario = sc.nextDouble();
		char porcento = '%';
		if (salario >= 0 && salario <= 400.00)
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %c\n",
					salario + (salario * 0.15), salario * 0.15, porcento);
		else if (salario >= 400.01 && salario <= 800.00)
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %c\n",
					salario + (salario * 0.12), salario * 0.12, porcento);
		else if (salario >= 800.01 && salario <= 1200.00)
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %c\n",
					salario + (salario * 0.10), salario * 0.10, porcento);
		else if (salario >= 1200.01 && salario <= 2000.00)
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %c\n",
					salario + (salario * 0.07), salario * 0.07, porcento);
		else if (salario >= 2000.01)
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %c\n",
					salario + (salario * 0.04), salario * 0.04, porcento);
	}

}
