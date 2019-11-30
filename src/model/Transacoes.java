package model;

public interface Transacoes {
	public boolean saque(double val);
	public boolean transferencia(double val);
	public boolean deposito(double val);
	public boolean pagamento(double val);
}
