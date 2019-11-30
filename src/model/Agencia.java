package model;

public class Agencia
{
	private int num;
	private String nomeFicticio;	
	private Endereco end;
	private String cpfGerente;
	
	public Agencia(int num, String nomeFicticio, Endereco end, String cpfGerente) {
		super();
		this.num = num;
		this.nomeFicticio = nomeFicticio;
		this.end = end;
		this.cpfGerente = cpfGerente;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNomeFicticio() {
		return nomeFicticio;
	}
	public void setNomeFicticio(String nomeFicticio) {
		this.nomeFicticio = nomeFicticio;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public String getCpfGerente() {
		return cpfGerente;
	}
	public void setCpfGerente(String cpfGerente) {
		this.cpfGerente = cpfGerente;
	}
}
