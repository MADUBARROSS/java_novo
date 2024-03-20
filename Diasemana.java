package estruturaCondicional;

import java.util.Scanner;

public class Diasemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int DiaSemana;

		System.out.println(" Digite o numero do dia sa semana(1-7) ");
		DiaSemana = ler.nextInt();
		
		if (DiaSemana == 1) {
			System.out.println("O dia é segunda");
		}else if (DiaSemana == 2) {
			System.out.println("O dia é terça");
		}else if (DiaSemana == 3) {
			System.out.println("O dia é quarta");
		}else if (DiaSemana == 4) {
			System.out.println("O dia é quinta");
		}else if (DiaSemana == 5) {
			System.out.println("O dia é sexta");
		}else if (DiaSemana == 6) {
			System.out.println("O dia é sabado");
		}else if (DiaSemana == 7) {
			System.out.println("O dia é domingo");
		}else {
			System.out.println("Dia inválido");
		}
		ler.close();
	}
}