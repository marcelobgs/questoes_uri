package questoes_uri;

import java.util.Scanner;

public class questao1049 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String palavra1 = sc.next();
		String palavra2 = sc.next();
		String palavra3 = sc.next();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("pomba");
				}
			} else if (palavra2.equalsIgnoreCase("mamifero")) {
				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				}
				if (palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				}
			}
		} else if (palavra1.equalsIgnoreCase("invertebrado")) {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else if (palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("lagarta");
				}
			} else if (palavra2.equalsIgnoreCase("anelideo")) {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
	}

}
