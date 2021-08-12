package questoes_uri;

import java.util.Scanner;

public class questao1066 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		int somPar = 0;
		int somImpar = 0;
		int somPos = 0;
		int somNeg = 0;
		for (int i = 0; i < 5; i++) {
			a = sc.nextInt();
			if (a % 2 == 0)
				somPar++;
			else
				somImpar++;
			if (a > 0)
				somPos++;
			else if(a < 0)
				somNeg++;
		}
		System.out.println(somPar + " valor(es) par(es)");
		System.out.println(somImpar + " valor(es) impar(es)");
		System.out.println(somPos + " valor(es) positivo(s)");
		System.out.println(somNeg + " valor(es) negativo(s)");
	}

}
