/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package control;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author gabri
 */
public class CadastraArq{
    
    
    private String Tipo;/*Tipo de classe*/
    private StringBuilder dados = new StringBuilder();
    public String getTipo() { return Tipo; }
    public void setTipo(String tipo) {
	    String ctipo = String.valueOf(tipo);
	    this.Tipo = ctipo;
    }
    public void cadastraPessoa(Pessoa ob)
    {
	        Endereco end = ob.getEnd();
	    	this.dados.append(ob.getCPF());
		this.dados.append(",");
		this.dados.append(ob.getSenha());
		this.dados.append(",");
		this.dados.append(ob.getNome());
		this.dados.append(",");
		this.dados.append(end.getLogradouro());
		this.dados.append(",");
		this.dados.append(end.getCEP());
		this.dados.append(",");
		this.dados.append(end.getCidade());
		this.dados.append(",");
		this.dados.append(end.getBairro());
		this.dados.append(",");
		this.dados.append(end.getNum());
		this.dados.append(",");
		this.dados.append(end.getComplemento());
		this.dados.append(",");
		this.dados.append(end.getEstado());
		this.dados.append(",");
		this.dados.append(ob.getEstadoCivil());
		this.dados.append(",");
		this.dados.append(ob.getDataNascimento());
		this.dados.append(",");
		this.dados.append(ob.getAtiva());
		
    }
    public void cadastraFuncionario(Funcionario ob)
    {
	    cadastraPessoa(ob);
	    this.dados.append(",");
	    this.dados.append(ob.getCPTS());
	    this.dados.append(",");
	    this.dados.append(ob.getRG());
	    this.dados.append(",");
	    this.dados.append(ob.getSexo());
	    this.dados.append(",");
	    this.dados.append(ob.getCargo());
	    this.dados.append(",");
	    this.dados.append(ob.getSalario()); 
	    this.dados.append(",");
	    this.dados.append(ob.getNumAgencia());
    }
    public void cadastraGerente(Gerente ob)
    {
	    cadastraFuncionario(ob);
	    this.dados.append(",");
            this.dados.append(ob.getDataIngresso());
            this.dados.append(",");
	    this.dados.append(ob.getPossuiCurso());
    }
    public void cadastraCliente(Cliente ob)
    {
	    cadastraPessoa(ob);
	    this.dados.append(",");
	    this.dados.append(ob.getNumAgencia());
	    this.dados.append(",");
	    this.dados.append(ob.getEscolaridade());
	    this.dados.append(",");
	    StringBuilder sb = new StringBuilder();
	    for(String s : ob.getContas()){
		    sb.append(s);
		    sb.append(".");
	    }
	    this.dados.append(sb);
    }
    public void cadastraConta(Conta ob)
    {
       this.dados.append(ob.getnumConta());
       this.dados.append(",");
       this.dados.append(ob.getSenha());
       this.dados.append(",");
       this.dados.append(ob.getAtiva());
       this.dados.append(",");
       this.dados.append(ob.getnumAgencia());
       this.dados.append(",");
       this.dados.append(ob.getSaldoAtual());
       this.dados.append(",");
       this.dados.append(ob.getDataAbertura());
       this.dados.append(",");
       this.dados.append(ob.getDataUltMovimentacao());
       this.dados.append(",");
       this.dados.append(ob.getTransacoes());
    }
    public void cadastraCorrente(ContaCorrente ob)
    {
	    cadastraConta(ob);
            this.dados.append(",");
	    this.dados.append(ob.getLimiteChequeEsp());
	    this.dados.append(",");
	    this.dados.append(ob.getTaxaAdm());
    }
    public void cadastraPoupanca(ContaPoupanca ob)
    {
	    cadastraConta(ob);
            this.dados.append(",");
	    this.dados.append(ob.getRendimentoMesAtual());
    }
    public void cadastraSalario(ContaSalario ob)
    {
	    cadastraConta(ob);
	    this.dados.append(",");
	    this.dados.append(ob.getLimiteSaque());
	    this.dados.append(",");
	    this.dados.append(ob.getLimiteTransferencia());
    }
    public CadastraArq(Funcionario ob)
    {	
	    String[] parts = ob.getClass().toString().split(" ");
	    setTipo(parts[1]);
	    cadastraFuncionario(ob);
    }
    public CadastraArq(Gerente ob)
    {	
	    String[] parts = ob.getClass().toString().split(" ");
	    setTipo(parts[1]);
	    cadastraGerente(ob);
    }
    public CadastraArq(Agencia ob)
    {	
	    String[] parts = ob.getClass().toString().split(" ");
	    setTipo(parts[1]);
	    Endereco end = ob.getend();
	    this.dados.append(ob.getNumAgencia());
	    this.dados.append(",");
	    this.dados.append(ob.getnomeFicticio());
	    this.dados.append(",");
	    this.dados.append(end.getLogradouro());
            this.dados.append(",");
	    this.dados.append(end.getCEP());
	    this.dados.append(",");
	    this.dados.append(end.getCidade());
	    this.dados.append(",");
	    this.dados.append(end.getBairro());
	    this.dados.append(",");
	    this.dados.append(end.getNum());
	    this.dados.append(",");
	    this.dados.append(end.getComplemento());
	    this.dados.append(",");
	    this.dados.append(end.getEstado());
	    this.dados.append(",");
	    this.dados.append(ob.getcpfGerente());
	    this.dados.append(",");
	    this.dados.append(ob.getAtiva());
    }
    public CadastraArq(Cliente ob)
    {	
	    String[] parts = ob.getClass().toString().split(" ");
	    setTipo(parts[1]);
	    cadastraCliente(ob);
    }
     public CadastraArq(ContaCorrente ob)
    {	
	    String[] parts = ob.getClass().toString().split(" ");
	    setTipo(parts[1]);
	    cadastraCorrente(ob);
    }
    public CadastraArq(ContaPoupanca ob)
    {	
	    String[] parts = ob.getClass().toString().split(" ");
	    setTipo(parts[1]);
	    cadastraPoupanca(ob);
    }
    public CadastraArq(ContaSalario ob)
    {	
	    String[] parts = ob.getClass().toString().split(" ");
	    setTipo(parts[1]);
	    cadastraSalario(ob);
    } 
    public void salvar() throws IOException
     {
            try {
                this.dados.append('\n');//Para fazer a divisao de linhas
                FileWriter fw = new FileWriter(getTipo()+".txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.print(this.dados);
                pw.flush(); // enviar os dados ao formúlario e não armazenar em um buffer 
                fw.flush();
                pw.close();
                fw.close();
                
            } catch (IOException ex) {
               throw ex;
            }
       
     }
     
}
