//package POO_trab.src.model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	private ArrayList<Integer> contas;
	private  String numAgencia;
	private String escolaridade;
	
	
	public Cliente(String cPF,String senha, String nome, Endereco end, String estadoCivil, String dataNascimento,  String numAgencia, String escolaridade) {
		super(cPF,senha, nome, end, estadoCivil, dataNascimento);
		this.numAgencia = numAgencia;
		this.escolaridade = escolaridade;
	}
	public ArrayList<Integer> getContas() {
		return contas;
	}
	public void setContas(ArrayList<Integer> contas) {
		this.contas = contas;
	}
	public void addConta(int numConta) {
		this.contas.add(numConta);
	}
	public void removeConta(int numConta) {
		this.contas.remove(numConta);
	}
	public String getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia( String numAgencia) {
		this.numAgencia = numAgencia;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
}
