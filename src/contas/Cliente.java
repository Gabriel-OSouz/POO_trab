package POO_trab.src.contas

import java.util.ArrayList;
/**
 * POO Trab UFU
 * Class Conta
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */
/* Interface responsavel pela autentificacao */
interface Log
{
	boolean login(String senha);
}
public class Cliente
{
	protected ArrayList<Contas> contas;
	private String senha;
}
