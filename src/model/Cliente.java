package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	private ArrayList<Integer> contas;
	private int numAgencia;
	private String escolaridade;
	
	
	public Cliente(String cPF, String nome, Endereco end, String estadoCivil, String dataNascimento, int numAgencia, String escolaridade) {
		super(cPF, nome, end, estadoCivil, dataNascimento);
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
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
}
