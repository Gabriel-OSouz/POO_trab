//package control;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;




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
	private static ArrayList<ContaCorrente> ccs = new ArrayList<ContaCorrente>();
	private static ArrayList<ContaPoupanca> cps = new ArrayList<ContaPoupanca>();
	private static ArrayList<ContaSalario> css = new ArrayList<ContaSalario>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList <Funcionario>();
	private int Permissao; 
	private String agente;
	/* 0: Funcionario
	 * 1: Gerente
	 * 2: Admin
	 * */
	public Agencia buscaAgencia(String numAgencia) throws NotFoundError, IOException
	{
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("Agencia.txt"));
			String line = reader.readLine();
			while(line != null){
				String alvo[] = line.split(",");
				if(alvo[0].equals(numAgencia)&& alvo[10].equals("true")){
					reader.close();
					return new Agencia(alvo[0],alvo[1],new Endereco(alvo[2],alvo[3],alvo[4],alvo[5],alvo[6],alvo[7],alvo[8]), alvo[9]);
			
				}
			}
		}catch(IOException ex){
			throw ex;
		}
		reader.close();
		throw new NotFoundError("Agencia nao encontrada");
	}
	public Gerente buscaGerente(String cpfGerente) throws NotFoundError, IOException
	{
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("Gerente.txt"));
			String line = reader.readLine();
			while(line != null){
				String alvo[] = line.split(",");
				if(alvo[0].equals(cpfGerente)&&alvo[12].equals("true")){
					reader.close();
					return new Gerente(alvo[0],alvo[1],alvo[2], new Endereco(alvo[3],alvo[4],alvo[5],alvo[6],alvo[7],alvo[8],alvo[9]), alvo[10],alvo[11],alvo[13],alvo[14],alvo[15].charAt(0),alvo[16], Double.parseDouble(alvo[17]), alvo[18],alvo[19],Boolean.parseBoolean(alvo[20]));
				}
			}
		}catch(IOException ex){
			throw ex;
		}
		reader.close();
		throw new NotFoundError("Agencia nao encontrada");
	}
	public Funcionario buscaFuncionario(String cpfFuncionario) throws NotFoundError, IOException
	{
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("Funcionario.txt"));
			String line = reader.readLine();
			while(line != null){
				String alvo[] = line.split(",");
				if(alvo[0].equals(cpfFuncionario)&&alvo[12].equals("true")){
					reader.close();
					return new Funcionario(alvo[0],alvo[1],alvo[2], new Endereco(alvo[3],alvo[4],alvo[5],alvo[6],alvo[7],alvo[8],alvo[9]), alvo[10],alvo[11],alvo[13], alvo[14],alvo[15].charAt(0),alvo[16],Double.parseDouble(alvo[17]), alvo[18]);
				}
			}
		}catch(IOException ex){
			throw ex;
		}
		reader.close();
		throw new NotFoundError("Agencia nao encontrada");
	}
	public Cliente buscaCliente(String cpfCliente) throws NotFoundError, IOException
	{
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("Cliente.txt"));
			String line = reader.readLine();
			while(line != null){
				String alvo[] = line.split(",");
				if(alvo[0].equals(cpfCliente)&&alvo[12].equals("true")){
					reader.close();
					return new Cliente(alvo[0],alvo[1],alvo[2], new Endereco(alvo[3],alvo[4],alvo[5],alvo[6],alvo[7],alvo[8],alvo[9]), alvo[10],alvo[11],alvo[13],alvo[14]);
			
				}
			}
		}catch(IOException ex){
			throw ex;
		}
		reader.close();
		throw new NotFoundError("Agencia nao encontrada");
	}
	public ContaCorrente buscaContaCorrente(String numConta) throws NotFoundError, IOException
	{
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("ContaCorrente.txt"));
			String line = reader.readLine();
			while(line != null){
				String alvo[] = line.split(",");
				if(alvo[0].equals(numConta)&&alvo[2].equals("true")){
					reader.close();
					return new ContaCorrente(alvo[3],alvo[1],alvo[0],alvo[5]);
			
				}
			}
		}catch(IOException ex){
			throw ex;
		}
		reader.close();
		throw new NotFoundError("Agencia nao encontrada");
	}
	public ContaPoupanca buscaContaPoupanca(String numConta) throws NotFoundError, IOException
	{
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("ContaPoupanca.txt"));
			String line = reader.readLine();
			while(line != null){
				String alvo[] = line.split(",");
				if(alvo[0].equals(numConta)&&alvo[2].equals("true")){
					reader.close();
					return new ContaPoupanca(alvo[3],alvo[1],alvo[0],alvo[5]);
			
				}
			}
		}catch(IOException ex){
			throw ex;
		}
		reader.close();
		throw new NotFoundError("Agencia nao encontrada");
	}
	public ContaSalario buscaContaSalario(String numConta) throws NotFoundError, IOException
	{
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("ContaSalario.txt"));
			String line = reader.readLine();
			while(line != null){
				String alvo[] = line.split(",");
				if(alvo[0].equals(numConta)&&alvo[2].equals("true")){
					reader.close();
					return new ContaSalario(alvo[3],alvo[1],alvo[0],alvo[5]);
			
				}
			}
		}catch(IOException ex){
			throw ex;
		}
		reader.close();
		throw new NotFoundError("Agencia nao encontrada");
	}

	public void addAgencia(Agencia ag) throws PermissionError, FoundError, IOException
	{
		if(this.Permissao == 2){
			try{
				Agencia av = buscaAgencia(ag.getNumAgencia());
				throw new FoundError("Agencia ja existe");	
			}catch(NotFoundError ex){
				this.agencias.add(ag);
			}catch(IOException e){
				throw e;
			}
		}else throw new PermissionError("Permissao negada");	
	}
	public void addContaCorrente(ContaCorrente co) throws NotFoundError, FoundError, IOException
	{
		try{
			Agencia av = buscaAgencia(co.getnumAgencia());
		}catch(NotFoundError ex){
			throw ex;
		}catch(IOException e){
			throw e;
		}
		try{
			ContaCorrente cc = buscaContaCorrente(co.getnumConta());
			throw new FoundError("Conta ja existe");
		}catch(NotFoundError xe){
			this.ccs.add(co);
		}
	}
	public void addContaPoupanca(ContaPoupanca co) throws NotFoundError, FoundError, IOException
	{	
		try{
			Agencia av = buscaAgencia(co.getnumAgencia());
		}catch(NotFoundError ex){
			throw ex;
		}catch(IOException e){
			throw e;
		}
		try{
			ContaPoupanca cp = buscaContaPoupanca(co.getnumConta());
			throw new FoundError("Conta ja existe");
		}catch(NotFoundError xe){
			this.cps.add(co);
		}

	}
	public void addContaSalario(ContaSalario co) throws NotFoundError, IOException, FoundError
	{
		try{
			Agencia av = buscaAgencia(co.getnumAgencia());
		}catch(NotFoundError ex){
			throw ex;
		}catch(IOException e){
			throw e;
		}
		try{
			ContaSalario cs = buscaContaSalario(co.getnumConta());
			throw new FoundError("Conta ja existe");
		}catch(NotFoundError xe){
			this.css.add(co);
		}

	}
	public void addFuncionario(Funcionario fu) throws PermissionError, FoundError, NotFoundError, IOException
	{
		if(this.Permissao > 0){
			if(this.Permissao == 2){
			    if(fu.getNumAgencia().equals(this.agente))
				try{
					Agencia av = buscaAgencia(fu.getNumAgencia());
				}catch(NotFoundError ex){
					throw ex;
				}catch(IOException e){
					throw e;
				}
				    try{
					Funcionario fo = buscaFuncionario(fu.getCPF());
					throw new FoundError("Funcionario ja existe");
				}catch(NotFoundError xe){
					this.funcionarios.add(fu);
				}
						
			}else throw new PermissionError("Nao tem permissão de alterar dados de outras Agencias");
		}else throw new PermissionError("Permissao negada");
	}
	public void addGerente(Gerente ge) throws PermissionError, FoundError, NotFoundError, IOException
	{
		if(this.Permissao == 2){
			try{
				Agencia ag = buscaAgencia(ge.getNumAgencia());
				if(ag.getcpfGerente().equals(ge.getCPF())){
					try{
						Gerente go = buscaGerente(ge.getCPF());
						throw new FoundError("Gerente ja esta cadastrado");
						
					}catch(NotFoundError ex){
						this.gerentes.add(ge);
					}
				}
				else throw new  PermissionError("Nao eh permitido adicionar dois Gerentes a mesma Agencia");
			}catch(NotFoundError xe){
				throw xe;
			}catch(IOException e){
				throw e;
			}
		}else throw new PermissionError("Permissao negada");
	}
	public void addCliente(Cliente cl) throws PermissionError, FoundError, NotFoundError, IOException
	{
		if(this.Permissao > 0){
			try{
				Agencia ag = buscaAgencia(cl.getNumAgencia());
				try{
					Cliente ca = buscaCliente(cl.getCPF());
					throw new FoundError("Cliente ja esta cadastrado");
				}catch(NotFoundError ex){
					this.clientes.add(cl);
				}
			}catch(NotFoundError xe){
				throw xe;
			}catch(IOException e){
				throw e;
			}
		}else throw new PermissionError("Permissao negada");
	}
/*
	public void removeCorrente(ContaCorrente co)
	{
		boolean flag = false;
		for(Iterator it = this.ccs.iterator(); it.hasNext();){
			String c = it.next().numConta();
			if(c.equals(co.numConta())){
				flag = true;
				c.setAtiva(false)
			}
			if(!flag){
				try{
					ContaCorrente cc = buscaContaCorrente(co.getnumConta());
					
}

	public void removeFuncionario(Funcionario fu);
	public void removeGerente(Gerente ge);
	public void removeCliente(Cliente cl);
*/
	public ControlInst(Funcionario fun)
	{
		this.Permissao = 0;
		this.agente = fun.getNumAgencia();//Garante que ele só faça alteraçoes na agencia dele.
	}
	public ControlInst(Gerente ger)
	{
		this.Permissao = 1;
		this.agente = ger.getNumAgencia();
	}
	public ControlInst(Admin adm)
	{
		this.Permissao = 2;
	}
	public void salvar(ArrayList<? extends Object> ob) throws PersistenceError, NotFoundError
	{
	
		 for(Iterator i = ob.iterator(); i.hasNext();){
			 CadastraArq aq;
			 try{
			 	Object c = i.next();
				String tipo = c.getClass().toString();
				if(tipo == "class Funcionario")
					aq = new CadastraArq((Funcionario)c);
				else if(tipo == "class Gerente")
					aq = new CadastraArq((Gerente)c);
				else if(tipo == "class Agencia")
					aq = new CadastraArq((Agencia)c);
				else if(tipo == "class Cliente")	
					aq = new CadastraArq((Cliente)c);
				else if(tipo == "class ContaCorrente")
					aq = new CadastraArq((ContaCorrente)c);
				else if(tipo == "class ContaPoupanca")
					aq = new CadastraArq((ContaPoupanca)c);
				else if(tipo == "class ContaSalario")
					aq = new CadastraArq((ContaSalario)c);
				else
				    throw new NotFoundError("Classe nao encontrada");
				aq.salvar();
		 	}catch(IOException e){
				throw  new PersistenceError("Erro ao salvar arquivo");
			}
		 }
	}
	public void persistence() throws PersistenceError, NotFoundError
	{
		try{
			salvar(this.agencias);
			salvar(this.ccs);
			salvar(this.cps);
			salvar(this.css);
			salvar(this.clientes);
			salvar(this.gerentes);
			salvar(this.funcionarios);
		}catch(PersistenceError ex){
			throw ex;
		}catch(NotFoundError e){
			throw e;
		}
	}

}
