package POO_trab.src.contas

/**
 * POO Trab UFU
 * Class Conta
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */
//interface responsavel pelas operacoes em cada conta
interface transacoes
{
	public static double saque(double val);
	public double transf(Conta alvo, double val);
	public double deposito(double val);

}

//Classe generica para conta
public class Conta implements Log
{
    protected String nrconta;
    protected String dataemissao;
    protected String datamov;
    private boolean ativa;
    
}
//classe com os atributos de uma conta salario
class ContaSalario extends Conta
{
	private double saldo;
	private double limsaque;
	private double limtrans;
}
//classe com os atributos de uma conta corrente
class ContaCorrente extends Conta
{
	private double limcespecial;//lim cheque especial
	private double taxadm;
	private double saldo;
}
//classe com os atributos de uma conta poupanca
class ContaPoupanca extends Conta
{
	private double rendatual;
	private double saldo;
}

