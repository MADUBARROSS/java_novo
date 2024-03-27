package estruturaCondicional;

import java.util.Scanner;

public class Mesproject {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;

		System.out.println(" Digite o numero do mes(1-12) ");
		mes = ler.nextInt();
		
		if (mes == 1) {
			System.out.println("O mes é janeiro");
		}else if (mes == 2) {
			System.out.println("O mes é fevereiro");
		}else if (mes == 3) {
			System.out.println("O mes é março");
		}else if (mes == 4) {
			System.out.println("O mes é abril");
		}else if (mes == 5) {
			System.out.println("O mes é maio");
		}else if (mes == 6) {
			System.out.println("O mes é junho");
		}else if (mes == 7) {
			System.out.println("O mes é julho");
		}else if (mes == 8) {
			System.out.println("O mes é agosto");
		}else if (mes == 9) {
			System.out.println("O mes é setembro");
		}else if (mes == 10) {
			System.out.println("O mes é outubro");
		}else if (mes == 11) {
			System.out.println("O mes é novembro");
		}else if (mes == 12) {
			System.out.println("O mes é dezembro");
		}else {
			System.out.println("Dia inválido");
		}
		ler.close();

	}

}
