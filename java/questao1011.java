package questoes_uri;

import java.util.Scanner;

public class questao1011 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		System.out.printf("VOLUME = %.3f",(4/3.0) * pi *(raio*raio*raio));
		
	}

}
