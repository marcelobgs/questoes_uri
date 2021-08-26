package questoes_uri;

public class questao1096 {

	public static void main(String[] args) {

		int numI = 1, numJ = 7;

		while (numI <= 10) {
			System.out.println("I=" + numI + " J=" + numJ);
			numJ -= 1;
			if (numJ <= 4) {
				numI += 2;
				numJ +=3;
			}

		}
	}

}
