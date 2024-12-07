package desafio;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		String nome = "Daniel Galvão";
		String tipoCOnta = "Corrente";
		double saldo = 32987.87;
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("************************************************");
		System.out.println("\nNome do cliente: " + nome);
		System.out.println("Nome do cliente: " + tipoCOnta);
		System.out.println("Nome do cliente: " + saldo);
		System.out.println("\n************************************************");
		
		String menu = """
				** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
				""";
		
		while(opcao != 4) {
			System.out.println(menu);
			opcao = scanner.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("\nSeu saldo atual é: " + saldo + "\n");
					break;
					
				case 2:
					System.out.print("Qual o valor que deseja transferir: ");
					double valor = scanner.nextDouble();
					
					if(valor > saldo) {
						System.out.print("Saldo insuficiente para realizar transferencia");
					}else {
						saldo -= valor;
						System.out.println("Novo Saldo: " + saldo + "\n");
					}
					break;
					
				case 3:
					System.out.print("Saldo Recebido: ");
					double valorRecebido = scanner.nextDouble();
					saldo += valorRecebido;
					System.out.print("Novo Saldo: " + saldo + "\n");
					break;
					
				case 4:
					System.out.println("Saindo...");
					break;
			}
			
			if(opcao == 4) {
				break;
			}
		}
		
	}

}
