/**
 * POO Trab UFU
 * Class Pessoa
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */

public class Pessoa
{
	protected String nome;
	protected int idade;
	protected String cpf;
	protected String rg;
	protected char sexo;
	protected char estcivil;
	protected String escolaridade;
	protected String datanasc;
	protected boolean ehcliente = false;
	protected boolean ehfunc = false;

}

// Getters and Setters

    public String getNome(){ return nome;}

    public void setNome(String nome){ this.nome = nome;}

    public int getIdade(){return idade;}

    public void setIdade(int idade)
    {
        if(idade > 0)
        {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!\n");
        }
    }

    public String getCpf(){return cpf;}

    public void setCpf(String cpf){this.cpf = cpf;}

    public String getRg(){return rg;}

    public void setRg(String rg){this.rg = rg;}

    public char getSexo(){return sexo;}

    public void setSexo(char sexo)
    {
        if(sexo != 'f' ||sexo != 'F' ||sexo != 'n' ||sexo != 'M' ||)
        this.sexo = sexo;
            else System.out.println("Sexo ínválido");
    }

    public char getEstcivil(){return estcivil;}

    public void setEstcivil(char estcivil){this.estcivil = estcivil;}

    public String getEscolaridade(){return escolaridade;}

    public void setEscolaridade(String escolaridade){this.escolaridade = escolaridade;}

    public String getDatanasc(){return datanasc;}

    public void setDatanasc(String datanasc){this.datanasc = datanasc;}

    public boolean isEhcliente(){return ehcliente;}

    public void setEhcliente(boolean ehcliente){this.ehcliente = ehcliente;}

    public boolean isEhfuncionario(){return ehfuncionario;}

    public void setEhfuncionario(boolean ehfuncionario){this.ehfuncionario = ehfuncionario;}
