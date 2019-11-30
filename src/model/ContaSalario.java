package model;

public class ContaSalario extends Conta implements Transacoes {
	private double limiteSaque;
	private double limiteTransferencia;
	
	public ContaSalario(int numAgencia, String senha, int numConta, String dataAbertura) {
		super(numAgencia, senha, numConta, dataAbertura);
		this.limiteSaque = 500;
		this.limiteTransferencia = 1000;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getLimiteTransferencia() {
		return limiteTransferencia;
	}

	public void setLimiteTransferencia(double limiteTransferencia) {
		this.limiteTransferencia = limiteTransferencia;
	}

	public boolean saque(double val) {
		if (val > this.getSaldoAtual() || val > this.getLimiteSaque())
			return false;
		else {
			double saldoAtualizado = this.getSaldoAtual() - val;
			this.setSaldoAtual(saldoAtualizado);
		}
		return true;
	}

	public boolean transferencia(double val) {
		if (val > this.getSaldoAtual() || val > this.getLimiteTransferencia())
			return false;
		else {
			double saldoAtualizado = this.getSaldoAtual() - val;
			this.setSaldoAtual(saldoAtualizado);
		}
		return true;
	}

	public boolean deposito(double val) {
		double saldoAtualizado = this.getSaldoAtual() + val;
		this.setSaldoAtual(saldoAtualizado);
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
