package model;

public class Funcionario extends Pessoa{
	private String CPTS;
	private String RG;
	private char sexo;
	private String cargo;
	private double salario;
	public Funcionario(String cPF, String nome, Endereco end, String estadoCivil, String dataNascimento, String cPTS,
			String rG, char sexo, String cargo, double salario) {
		super(cPF, nome, end, estadoCivil, dataNascimento);
		CPTS = cPTS;
		RG = rG;
		this.sexo = sexo;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getCPTS() {
		return CPTS;
	}
	public void setCPTS(String cPTS) {
		CPTS = cPTS;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
