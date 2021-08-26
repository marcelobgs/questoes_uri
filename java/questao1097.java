package questoes_uri;

public class questao1097 {

	public static void main(String[] args) {
		int numI = 1, numJ = 7;
		while (numI <= 9) {
			for (int i = 0; i < 3; i++) {
				System.out.println("I=" + numI + " J=" + numJ);
				numJ--;
			}
			numI += 2;
			numJ += 5;
		}

	}

}
