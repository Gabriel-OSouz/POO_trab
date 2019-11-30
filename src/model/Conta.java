/**
 * POO Trab UFU
 * Class Conta
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */
//interface responsavel pelas operacoes em cada conta
interface transacao
{
	double saque(double val);
	double transf(Conta alvo, double val);
	double deposito(double val);

}

//Classe generica para conta
public class Conta
{
    protected String nrconta;
    protected String dataemissao;
    protected String datamov;
    private boolean ativa;
    public boolean login(String senha){ return true;}
}

//classe com os atributos de uma conta salario
class ContaSalario extends Conta implements Log
{
	private double saldo;
	private double limsaque;
	private double limtrans;
	public login(String senha){ return true;}
}
//classe com os atributos de uma conta corrente
class ContaCorrente extends Conta implements Log
{
	private double limcespecial;//lim cheque especial
	private double taxadm;
	private double saldo;
	public boolean login(String senha){ return true;}

}
//classe com os atributos de uma conta poupanca
class ContaPoupanca extends Conta implements Log
{
	private double rendatual;
	private double saldo;
	public boolean login(String senha){ return true;}

}

