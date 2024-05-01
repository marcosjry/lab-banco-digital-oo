
public class Cliente {

	private String nome;
	private String cpf;
	private String telefone;

	public Cliente(String nome, String cpf, String telefone) {
		validarParametro(nome, "Nome");
		validarParametro(cpf, "CPF");
		validarParametro(telefone, "Telefone");
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/*
	 * 	Método usado para verificar se os parâmetros passados estão vazios ou nulos.
	 */
	private void validarParametro(String parametro, String nomeParametro) {
		if (parametro == null || parametro.isEmpty()) {
			throw new IllegalArgumentException(nomeParametro + " não pode ser vazio");
		}
	}

}
