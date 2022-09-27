import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano: ");
		int ano = entrada.nextInt();

		if(ano % 400 == 0){
			System.out.println(ano + " eh um ano bissexto");
		}else if(ano % 4 == 0 && ano % 100 != 0 ){
			System.out.println(ano + " eh um ano bissexto");
		}else{
			System.out.println(ano + " nao eh um ano bissexto");	
		}	
	}

}