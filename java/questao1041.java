package questoes_uri;

import java.util.Scanner;

public class questao1041 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (y > 0 && x > 0) {
            System.out.println("Q1");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (y < 0 && x > 0) {
            System.out.println("Q4");
        }
		
		
	}

}
