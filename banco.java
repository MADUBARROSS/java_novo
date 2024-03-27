package estruturaCondicional;

import java.util.Scanner;

public class banco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senha, cpf, saldo = 100, saque, valor;

		System.out.println("Ola, digite seu cpf:");
		cpf = ler.nextInt();

		if (cpf == 123456789) {
			System.out.println("Informe sua senha: ");
			senha = ler.nextInt();

			if (senha == 12345) {
				System.out.println("Seu saldo atual é de " + saldo +" Qual o valor que você deseja retirar?");
				saque = ler.nextInt();
				if (saque <= saldo) {
					valor = saldo - saque;
					System.out.println("saque concluido! você ainda tem " + valor);
				}
				else {
					System.out.println("O saldo é insuficiente");
				}
			}
			else {
				System.out.println("A senha esta incorreta");
			}
		}
		else {
			System.out.println("O cpf esta errado.");
		}
		ler.close();
	}


}

