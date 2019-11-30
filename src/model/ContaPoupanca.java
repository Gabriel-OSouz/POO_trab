package model;

public class ContaPoupanca extends Conta implements Transacoes {
	private double rendimentoMesAtual;

	public ContaPoupanca(int numAgencia, String senha, int numConta, String dataAbertura) {
		super(numAgencia, senha, numConta, dataAbertura);
	}

	public double getRendimentoMesAtual() {
		return rendimentoMesAtual;
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
