import java.util.Scanner;

public class IdadeEmDias {

	/*
	 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
	 * dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o
	 * mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
	 */

	public static void main(String[] args) {
		var entrada = new Scanner(System.in);
		System.out.println("Informe sua idade em: anos, meses e dias Exemplo: 3,2,15 ");
		String dias = entrada.next();

		String valores[] = dias.split(",");
		int total = (Integer.parseInt(valores[0].trim()) * 365) + (Integer.parseInt(valores[1].trim()) * 30)
				+ Integer.parseInt(valores[2].trim());

		System.out.println(valores[0]+" anos, " +valores[1]+ " meses, " + valores[2]+ " e dias = " + total + " dias");

	}

}
