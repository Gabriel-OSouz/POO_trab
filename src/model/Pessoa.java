//package POO_trab.src.model;

public class Pessoa {
	private String CPF;
	private String senha;
	private String nome;
	private Endereco end;
	private String estadoCivil;
	private String dataNascimento;
	
	public Pessoa(String cPF,String senha, String nome, Endereco end, String estadoCivil, String dataNascimento)
	{	
		CPF = cPF;
		this.senha = String.valueOf(senha);
		this.nome = String.valueOf(nome);
		this.end = end;
		this.estadoCivil = estadoCivil;
		this.dataNascimento = dataNascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setSenha(String senha)
	{
		String csenha = String.valueOf(senha);
		this.senha = csenha;
	}
	public String getSenha()
	{
		return this.senha;
	}
}
