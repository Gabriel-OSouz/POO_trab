import java.util.ArrayList;

package control;
/**
 * POO Trab UFU
 * Class ControlInst
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */
public class ControlInst
{
	private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	private static ArrayList<Conta> contas = new ArrayList<Conta>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList <Funcionario>();

	public void addAgencia(Agencia ag);
	public void addConta(Conta co);
	public void addFuncionario(Funcionario fu);
	public void addGerente(Gerente ge);
	public void addCliente(Cliente cl);
}
