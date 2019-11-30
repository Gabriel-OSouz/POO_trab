package model;

import java.util.ArrayList;

public class Conta {
	private ArrayList<Integer> clientes;
	private int numAgencia;
	private String senha;
	private boolean ativa;
	private int numConta;
	private double saldoAtual;
	private String dataAbertura;
	private String DataUltMovimentacao;
	private ArrayList<Transacao> transacoes;
	
	public Conta(int numAgencia, String senha, int numConta, String dataAbertura) {
		this.numAgencia = numAgencia;
		this.senha = senha;
		this.ativa = true;
		this.numConta = numConta;
		this.saldoAtual = 0;
		this.dataAbertura = dataAbertura;
	}

	public ArrayList<Integer> getClientes() {
		return clientes;
	}
	
	public void addCliente(int cpfCliente) {
		this.clientes.add(cpfCliente);
	}
	
	public void setClientes(ArrayList<Integer> clientes) {
		this.clientes = clientes;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataUltMovimentacao() {
		return DataUltMovimentacao;
	}

	public void setDataUltMovimentacao(String dataUltMovimentacao) {
		DataUltMovimentacao = dataUltMovimentacao;
	}
	
	public void addTransacao(Transacao tr) {
		this.transacoes.add(tr);
	}
	
	public ArrayList<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(ArrayList<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
	
}
