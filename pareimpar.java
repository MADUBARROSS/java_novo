package estruturaCondicional;

import java.util.Scanner;

public class pareimpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o numero: ");
		numero = ler.nextInt();
		
		if (numero%2 == 0)  {
			System.out.println("O numero é par");		
	 }
		else  {
			System.out.println("O numero é impar");
		}
		ler.close();

	}

}