import java.util.Scanner;

public class AntecessorSucessor {
	/* 
	 * Desenvolva um algoritmo em Java 
	 * que leia um número inteiro e 
	 * imprima o seu antecessor e seu sucessor.
	*/

	public static void main(String[] args) {
		var entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = entrada.nextInt();

		System.out.println("Antecessor do número: " + numero + " é: "+ (numero - 1));
		System.out.println("Sucessor do número: " + numero + " é: "+ (numero + 1));

	}

}