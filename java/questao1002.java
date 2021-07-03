package questoes_uri;

import java.util.Locale;
import java.util.Scanner;

public class questao1002 {

	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double raio, area;
		raio = sc.nextDouble();
		area = 3.14159 * (Math.pow(raio,2));
		System.out.printf("A=%.4f\n", area);

	}

}
