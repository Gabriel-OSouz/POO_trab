//package POO_trab.src.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente extends Pessoa {
	private ArrayList<String> contas = new ArrayList<String>();
	private  String numAgencia;
	private String escolaridade;
	
	
	public Cliente(String cPF,String senha, String nome, Endereco end, String estadoCivil, String dataNascimento,  String numAgencia, String escolaridade) {
		super(cPF,senha, nome, end, estadoCivil, dataNascimento);
		this.numAgencia = numAgencia;
		this.escolaridade = escolaridade;
	}
	public ArrayList<String> getContas() {
		return contas;
	}
	public void setContas(ArrayList<String> contas) {
		for(Iterator<String> it = contas.iterator(); it.hasNext();){
			this.contas.add((String)it.next());
		}
		
	}
	public void addConta(String numConta) {
		this.contas.add(numConta);
	}
	public void removeConta(String numConta) {
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
