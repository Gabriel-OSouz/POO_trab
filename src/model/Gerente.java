package model;

public class Gerente extends Funcionario {
	private String senha;
	private String dataIngresso;
	private int numAgencia;
	private boolean possuiCurso;
	
	public Gerente(String cPF, String nome, Endereco end, String estadoCivil, String dataNascimento, String cPTS,
			String rG, char sexo, String cargo, double salario, String senha, String dataIngresso, int numAgencia,
			boolean possuiCurso) {
		super(cPF, nome, end, estadoCivil, dataNascimento, cPTS, rG, sexo, cargo, salario);
		this.senha = senha;
		this.dataIngresso = dataIngresso;
		this.numAgencia = numAgencia;
		this.possuiCurso = possuiCurso;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public boolean isPossuiCurso() {
		return possuiCurso;
	}
	public void setPossuiCurso(boolean possuiCurso) {
		this.possuiCurso = possuiCurso;
	}
}
