/**
 * POO Trab UFU
 * Class Funcionario
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */
public class Funcionario extends Pessoa implements Log
{
	protected String cargo;
        protected double salario;
	protected String ctps;
	public boolean login(String senha){ return true;}
}


    public String getCargo(){return cargo;}

    public void setCargo(String cargo){this.cargo = cargo;}

    public double getSalario() {return salario;}

    public void setSalario(double salario) {
	   if(salario > 0) 
	    this.salario = salario;
    		else System.out.println("Salário não pode ser negativo!\n");
    }

    public String getCtps() {return ctps;}

    public void setCtps(String ctps) {this.ctps = ctps;}
