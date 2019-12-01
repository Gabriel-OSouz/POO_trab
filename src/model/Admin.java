package POO_trab.src.model;

/**
 * POO Trab UFU
 * Class Admin
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */

public class Admin
{
	private String cpf;
	private String senha;
	
	public Admin(String cpf, String senha) {
		this.cpf = cpf;
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
