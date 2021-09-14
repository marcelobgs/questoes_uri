package questoes_uri;

import java.util.Scanner;

public class questao1143 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println(i + " "+ (i*i)+" " + (i*i*i));

		}

	}

}
