public class Incremento{

	public static void main(String[] args){
		int num = 10;

		int novoNum1 = num + 1;
		System.out.println("Valor de num: " + num);

		int novoNum2 = num++;
		System.out.println("Valor de num: " + num);
		
		int novoNum3 = ++num;
		System.out.println("Valor de num: " + num);
		
		System.out.println("Resultado1: " + novoNum1);
		System.out.println("Resultado2: " + novoNum2);
		System.out.println("Resultado3: " + novoNum3);
	}
}