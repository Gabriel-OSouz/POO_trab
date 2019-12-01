//package POO_trab.src.model;

import java.util.ArrayList;

public class Conta {
	private String numAgencia;
	private String senha;
	private boolean ativa;
        private String numConta;
	private double saldoAtual;
	private String dataAbertura;
	private String DataUltMovimentacao;
	private ArrayList<Transacao> transacoes;
	
	public Conta(String numAgencia, String senha, String numConta, String dataAbertura) {
		this.numAgencia = numAgencia;
		this.senha = senha;
		this.ativa = true;
		this.numConta = numConta;
		this.saldoAtual = 0;
		this.dataAbertura = dataAbertura;
	}

	
	public String getnumAgencia() {
		return numAgencia;
	}

	public void setnumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

        public boolean getAtiva(){ return this.ativa; }
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public String getnumConta() {
		return numConta;
	}

	public void setnumConta(String numConta) {
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
