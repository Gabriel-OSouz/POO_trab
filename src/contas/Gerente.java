/**
 * POO Trab UFU
 * Class Gerente
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */
public class Gerente extends Funcionario
{
	private String dataingresso;
	/* o gerencia apenas gerencia uma agencia */
	private String agencia;
	private String formacao;
}

//Getter and setters
    public String getDataingresso(){return dataingresso;}

    public void setDataingresso(String dataingresso){this.dataingresso = dataingresso;}

    public String getAgencia(){return agencia;}

    public void setAgencia(String agencia){this.agencia = agencia;}

    public String getFormacao(){return formacao;}

    public void setFormacao(String formacao){this.formacao = formacao;}
