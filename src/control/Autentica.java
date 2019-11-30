import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * POO Trab UFU
 * Class Autentica
 * @author Leonardo Marinho de Melo junior
 * @author Vinicius Lopes Dias
 * @author Gabriel Oliveira Souza
 * @version 1.0
 */
        /* DIVISAO DO ARQUIVO:
	 * SEMPRE VEM CPF E SENHA NO COMEÇO SEPARADO POR VIRGULA
	 * EX: cpf,senha,nome,...
	 * */
public class Autentica
{
	private String cpf;
	private String senha;
	private String tipo;/*Tipo de classe*/

        public void setcpf(String cpf)
	{ 
		String ccpf = String.valueOf(cpf);
	       	this.cpf = ccpf;
       	}
	public void setsenha(String senha)
	{ 
		String csenha = String.valueOf(senha); 
		this.senha = csenha;
       	}
	public void settipo(String tipo)
	{ 
		String ctipo = String.valueOf(tipo); 
		this.tipo = ctipo;
       	}
	public String getcpf(){ return this.cpf; }
	public String getsenha(){ return this.senha; }
	public String gettipo(){ return this.tipo; }
	public Autentica(Object ob, String cpf, String senha)
	{
		String parts[] = ob.getClass().toString().split(" ");
		setcpf(cpf);
		setsenha(senha);
		settipo(parts[1]);
	}


	public int verifica(String tipo, String cpf, String senha)
	{
	 /* @param ob: Tipo de conta
	  * @param cpf: Cpf conta
	  * @param senha: senha conta 
	  * @return -1: Não existe nenhum registro
	  * @return -10: Falha em manipular arquivo
	  * @return  1: Conta não existe
	  * @return  2: Senha incorreta
	  * @return  3: Cpf não cadastrado
	  * @return  0: Sucess 
	  * */
		BufferedReader reader;
		try
		{
			reader = new BufferedReader(new FileReader(gettipo()+".txt"));
			String line[] = reader.readLine().split(",");
			while(line != null){
				if(line[0] == getcpf()){
					if(line[1] == getsenha()){
						reader.close();
						return 0;
					}else{
						reader.close();
						return 2;
				        }
				}
			}
			reader.close();
			return 3;
					
		}catch(FileNotFoundException fe)
		{
			return -1;
		}catch(IOException e){
			return -10;
		}
			
	}
	/* Recebe o cpf e a senha, verifica se bate no sistema e retorna a permissao */

}
