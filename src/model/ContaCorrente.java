package model;

public class ContaCorrente extends Conta implements Transacoes{
	private double limiteChequeEsp;
	private double taxaAdm;
	
	public ContaCorrente(int numAgencia, String senha, int numConta, String dataAbertura) {
		super(numAgencia, senha, numConta, dataAbertura);
		this.limiteChequeEsp = 1500;
		this.taxaAdm = 20;
	}

	public double getLimiteChequeEsp() {
		return limiteChequeEsp;
	}

	public void setLimiteChequeEsp(double limiteChequeEsp) {
		this.limiteChequeEsp = limiteChequeEsp;
	}

	public double getTaxaAdm() {
		return taxaAdm;
	}

	public void setTaxaAdm(double taxaAdm) {
		this.taxaAdm = taxaAdm;
	}

	public boolean saque(double val) {
		if (val > this.getSaldoAtual())
			return false;
		else {
			double saldoAtualizado = this.getSaldoAtual() - val;
			this.setSaldoAtual(saldoAtualizado);
		}
		return true;
	}

	public boolean transferencia(double val) {
		if (val > this.getSaldoAtual())
			return false;
		else {
			double saldoAtualizado = this.getSaldoAtual() - val;
			this.setSaldoAtual(saldoAtualizado);
		}
		return true;
	}

	public boolean deposito(double val) {
		if (val > this.getSaldoAtual())
			return false;
		else {
			double saldoAtualizado = this.getSaldoAtual() + val;
			this.setSaldoAtual(saldoAtualizado);
		}
		return true;
	}

	public boolean pagamento(double val) {
		if (val > this.getSaldoAtual())
			return false;
		else {
			double saldoAtualizado = this.getSaldoAtual() - val;
			this.setSaldoAtual(saldoAtualizado);
		}
		return true;
	}

	
}
