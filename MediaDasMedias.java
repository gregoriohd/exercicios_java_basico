import java.util.Arrays;
import java.util.List;

public class MediaDasMedias {
	/*
	 * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média
	 * dos números 4, 5 e 6. A soma das duas médias. A média das médias.
	 */

	public static void main(String[] args) {
		List<Integer> numeros1 = Arrays.asList(8, 9, 7);
		List<Integer> numeros2 = Arrays.asList(4, 5, 6);

		double media1 = somar(numeros1) / numeros1.toArray().length;

		System.out.println("média aritmética dos números 8,9 e 7:  " + media1);

		double media2 = somar(numeros2) / numeros2.toArray().length;
		
		System.out.println("média aritmética dos números 4,5 e 6:  " + media2);

		double mediaDasMedias = (media1 + media2) / 2;

		System.out.println(mediaDasMedias);

	}

	public static Integer somar(List<Integer> numeros) {
		int somatorio = 0;
		for (int valor : numeros) {

			somatorio += valor;
		}
		return somatorio;

	}

}