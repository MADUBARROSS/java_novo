package estruturaCondicional;

import java.util.Scanner;

public class positivonegativo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o numero: ");
		numero = ler.nextInt();
		
		if (numero > 0)  {
			System.out.println("O numero é positivo");
			
		}
		else if (numero == 0) {	
			System.out.println("O numero é zero");
	}
		else  {
			System.out.println("O numero é negativo");
		}
		ler.close();

	}

}
