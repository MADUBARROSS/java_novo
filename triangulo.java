package estruturaCondicional;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double a, b, c;
		
		
		System.out.println("Qual a primeira medida do triangulo?");
		a = ler.nextDouble();
		
		System.out.println("Qual a segunda medida do triangulo?");
		b = ler.nextDouble();
		
		System.out.println("Qual a terceira medida do triangulo?");
		c = ler.nextDouble();
		
		if (a == b && a == c) {
			System.out.println("o triangulo é equilatero");
		}else if (a != b && a != c) {
		    System.out.println("o triangulo é escaleno");
		}else {
			System.out.println("o triangulo é isoceles");
		}
		
		ler.close();
		
	}

}
