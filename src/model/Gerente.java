//package POO_trab.src.model;

public class Gerente extends Funcionario {
	private String dataIngresso;
	private String numAgencia;
	private boolean possuiCurso;
	
	public Gerente(String cPF,String senha, String nome, Endereco end, String estadoCivil, String dataNascimento, String cPTS,
			String rG, char sexo, String cargo, double salario,String dataIngresso, String numAgencia,
			boolean possuiCurso) {
		super(cPF,senha, nome, end, estadoCivil, dataNascimento, cPTS, rG, sexo, cargo, salario);
		this.dataIngresso = dataIngresso;
		this.numAgencia = numAgencia;
		this.possuiCurso = possuiCurso;
	}
	public String getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public String getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}
	public boolean getPossuiCurso() {
		return possuiCurso;
	}
	public void setPossuiCurso(boolean possuiCurso) {
		this.possuiCurso = possuiCurso;
	}
}
