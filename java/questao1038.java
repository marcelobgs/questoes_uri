package questoes_uri;

import java.util.Scanner;

public class questao1038 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		switch (codigo) {
		case 1:
			System.out.printf("Total: R$ %.2f\n", quantidade * 4.0);
			break;
		case 2:
			System.out.printf("Total: R$ %.2f\n", quantidade * 4.50);
			break;
		case 3:
			System.out.printf("Total: R$ %.2f\n", quantidade * 5.0);
			break;
		case 4:
			System.out.printf("Total: R$ %.2f\n", quantidade * 2.0);
			break;
		case 5:
			System.out.printf("Total: R$ %.2f\n", quantidade * 1.50);
			break;
		default:
			break;
		}

	}

}
