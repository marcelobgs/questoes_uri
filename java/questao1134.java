package questoes_uri;

import java.util.Scanner;

public class questao1134 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int alcoolCont = 0, gasolinaCont = 0, dieselCont = 0;
		int tipo = sc.nextInt();
		while (tipo < 1 || tipo > 4) {
			tipo = sc.nextInt();
		}
		while (tipo != 4) {
			if (tipo == 1)
				alcoolCont++;
			else if (tipo == 2)
				gasolinaCont++;
			else if (tipo == 3)
				dieselCont++;

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcoolCont);
		System.out.println("Gasolina: " + gasolinaCont);
		System.out.println("Diesel: " + dieselCont);
	}

}
