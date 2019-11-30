package model;

public class Pessoa {
	private String CPF;
	private String nome;
	private Endereco end;
	private String estadoCivil;
	private String dataNascimento;
	
	public Pessoa(String cPF, String nome, Endereco end, String estadoCivil, String dataNascimento) {
		super();
		CPF = cPF;
		this.nome = nome;
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
}
