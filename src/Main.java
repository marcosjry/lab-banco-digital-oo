import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		
		Banco listaClientes = new Banco();
		
		/* 
		Conta contaCorrente2 = new ContaCorrente(new Cliente("Marcelo", "Endereco 3", "34988683142"));
		Conta contaCorrente3 = new ContaCorrente(new Cliente("João", "Endereco 5", "34988683142"));

		listaClientes.adicionarClienteConta(contaCorrente3);

		System.out.println("====Exibindo extrato de todas as contas====");
		listaClientes.getContas().forEach(conta -> conta.imprimirExtrato());
		System.out.println("====Exibindo Conta de maior Saldo do Banco====");
		listaClientes.encontraMaiorSaldo().imprimirInfosComuns();
		*/
		boolean loop = true;

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		do {
			System.out.println("Digite o tipo de conta que você deseja abrir: ");
			
			System.out.println("1. Abrir Conta Corrente");
			System.out.println("2. Abrir Conta Poupança");
			System.out.println("3. Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			String nome, cpf, telefone;
			
			
			switch (opcao) {
				case 1:
					System.out.println("===Cadastro Iniciado===");
					System.out.println("Digite o seu NOME Completo:");
					nome = scanner.nextLine();
					System.out.println("Digite o seu CPF:");
					cpf = scanner.nextLine();
					System.out.println("Digite o seu TELEFONE:");
					telefone = scanner.nextLine();

					Conta contaCorrente = new ContaCorrente(new Cliente(nome, cpf, telefone));
					listaClientes.adicionarClienteConta(contaCorrente);

					System.out.println("Cadastro Finalizado!! \n \n1. Para consultar as opções da sua conta\n2.Para abrir uma nova conta\n");
					opcao = scanner.nextInt(); scanner.nextLine();
					
					if(opcao == 1) {
						loop = !loop;
						break;
					} else {
						continue;
					}

				case 2:
					System.out.println("===Cadastro Iniciado===");
					System.out.println("Digite o seu NOME Completo:");
					nome = scanner.nextLine();
					System.out.println("Digite o seu CPF:");
					cpf = scanner.nextLine();
					System.out.println("Digite o seu TELEFONE:");
					telefone = scanner.nextLine();

					Conta contaPoupanca = new ContaCorrente(new Cliente(nome, cpf, telefone));

					listaClientes.adicionarClienteConta(contaPoupanca);
					System.out.println("Cadastro Finalizado!! \n \n1. Para consultar as opções da sua conta\n2.Para abrir uma nova conta\n");
					opcao = scanner.nextInt(); scanner.nextLine();
					
					if(opcao == 1) {
						loop = !loop;
						break;
					} else {
						continue;
					}
				case 3:
					System.out.println("Saindo...");
					loop = !loop;
					break;
				default:
					System.out.println("Você inseriu uma opção inválida");
					break;

			}
		} while (loop);

		scanner.close();

		//Imprimindo as contas criadas pelo usuário
		listaClientes.getContas().forEach(conta -> conta.imprimirInfosComuns());
		
		
	}
}
