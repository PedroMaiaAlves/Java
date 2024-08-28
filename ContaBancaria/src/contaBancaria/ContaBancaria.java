package contaBancaria;

import java.util.Scanner;

public class ContaBancaria {

	private int conta;
	private String cpf;
	private double limite;
	private double saldo;

	public ContaBancaria(int Conta, String Cpf, double Limite, double Saldo) {
		conta = Conta;
		cpf = Cpf;
		limite = Limite;
		saldo = Saldo;
	}

	public void saque(double valorSaque) {
		if (valorSaque > saldo && valorSaque <= limite + saldo) {
			saldo -= valorSaque;
			limite -= valorSaque - saldo;
		} else if (valorSaque <= saldo) {
			saldo -= valorSaque;
		} else {
			System.out.println("Tente Sacar um valor válido da próxima vez.");
		}
	}

	public void deposito(double valorDeposito) {
		if (saldo >= 0) {
			saldo += valorDeposito;
		} else if (saldo < 0) {
			valorDeposito += saldo * 1.03;
			saldo = valorDeposito;
		}

	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public String getCpf() {
		return cpf;
	}

	public int getConta() {
		return conta;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		System.out.println("Crie sua conta bancária!");
		System.out.println("Digite o número da sua conta: ");
		int numeroconta = scanner.nextInt();
		if (numeroconta > 99999) {
			System.out.println("Número de conta inválida!");
			System.exit(0);
		}

		scanner.nextLine();

		System.out.println("Digite o seu CPF: ");
		String cpfconta = scanner.nextLine();

		System.out.println("Digite o limite da sua conta: ");
		double limiteconta = scanner.nextDouble();

		System.out.println("Digite o seu saldo: ");
		double saldoconta = scanner.nextDouble();

		ContaBancaria conta1 = new ContaBancaria(numeroconta, cpfconta, limiteconta, saldoconta);

		while (opcao != 5) {
			System.out.println("\n--- Menu Bancário ---");
			System.out.println("1. Ver saldo");
			System.out.println("2. Ver limite");
			System.out.println("3. Depositar");
			System.out.println("4. Sacar");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Seu saldo é: " + conta1.getSaldo());
				break;
			case 2:
				System.out.println("Seu limite é: " + conta1.getLimite());
				break;
			case 3:
				System.out.println("Digite o valor a ser depositado: ");
				double valorDeposito = scanner.nextDouble();
				conta1.deposito(valorDeposito);
				System.out.println("Depósito realizado com sucesso! Novo saldo: " + conta1.getSaldo());
				break;
			case 4:
				System.out.println("Digite o valor a ser sacado: ");
				double valorSaque = scanner.nextDouble();
				conta1.saque(valorSaque);
				System.out.println("Saque realizado! Novo saldo: " + conta1.getSaldo());
				break;
			case 5:
				System.out.println("Saindo do sistema. Obrigado por usar o nosso banco!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			scanner.close();
			}
		}
	}
}
