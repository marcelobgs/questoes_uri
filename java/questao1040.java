package questoes_uri;

import java.util.Scanner;

public class questao1040 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();

		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;

		if (media >= 7) {
			System.out.printf("Media: %.1f.\n", media);
			System.out.println("Aluno aprovado.");
		} else if (media < 7 && media >= 5) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno em exame.");
			double notaExame = sc.nextDouble();
			System.out.printf("Media: %.1f\n", notaExame);
			media = (media + notaExame) / 2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", media);
		} else {
			System.out.printf("Media final: %.1f\n", media);
			System.out.println("Aluno reprovado.");
		}
	}
}
