//package POO_trab.src.model;

public class Funcionario extends Pessoa{
	private String CPTS;
	private String RG;
	private char sexo;
	private String cargo;
	private double salario;
	public Funcionario(String cPF,String senha, String nome, Endereco end, String estadoCivil, String dataNascimento, String cPTS,
			String rG, char sexo, String cargo, double salario) {
		super(cPF,senha, nome, end, estadoCivil, dataNascimento);
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
		String cCPTS = String.valueOf(cPTS);
		this.CPTS = cCPTS;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		String cRG = String.valueOf(rG);
		this.RG = cRG;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		char csexo = Character.valueOf(sexo);
		this.sexo = csexo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		String ccargo = String.valueOf(cargo);
		this.cargo = ccargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
