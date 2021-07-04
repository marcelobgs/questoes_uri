package questoes_uri;

import java.util.Scanner;

public class questao1008 {

	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = "+ numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		

	}

}
