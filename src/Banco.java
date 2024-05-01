import java.util.LinkedList;
import java.util.List;

public class Banco {

	private final String nome = "Digital-Bank";
	private List<Conta> contas;

	public Banco() {
		this.contas = new LinkedList<>();
	}

	public void adicionarClienteConta(Conta e) {
		contas.add(e);
	}

	public void RemoverClienteConta(String nome) {
		for(Conta conta: contas) {
			if(conta.cliente.getNome().equalsIgnoreCase(nome)) {
				contas.remove(conta);
				System.out.println("Conta com o nome "+ nome +" removida.");
			}
		}
		
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void exibeConta() {
		System.out.println(contas);
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	protected Conta encontraMaiorSaldo() {
		Conta contaMaiorSaldo = null;
		double maiorSaldo = 0.0;
		for(Conta conta: contas) {
			if(maiorSaldo < conta.getSaldo()) {
				maiorSaldo = conta.getSaldo();
				contaMaiorSaldo = conta;
			}
		}
		if (contaMaiorSaldo == null) {
			throw new NullPointerException("Não foi encontrado a conta de maior saldo");
		}
		return contaMaiorSaldo;
	}

}
