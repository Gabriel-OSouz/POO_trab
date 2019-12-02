//package POO_trab.src.model;

public class Agencia
{
	private String num;
	private String nomeFicticio;	
	private Endereco end;
	private String cpfGerente;
	private boolean ativa;
	
	public Agencia( String num, String nomeFicticio, Endereco end, String cpfGerente){
		this.num = num;
		this.nomeFicticio = nomeFicticio;
		this.end = end;
		this.cpfGerente = cpfGerente;
		this.ativa = true;
	}
	public String getNumAgencia() {
	       return num;
	}
	public void setNumAgencia(String num) {
		this.num = num;
	}
	public String getnomeFicticio() {
		return nomeFicticio;
	}
	public void setnomeFicticio(String nomeFicticio) {
		this.nomeFicticio = nomeFicticio;
	}
	public Endereco getend() {
		return end;
	}
	public void setend(Endereco end) {
		this.end = end;
	}
	public String getcpfGerente() {
		return cpfGerente;
	}
	public void setcpfGerente(String cpfGerente) {
		this.cpfGerente = cpfGerente;
	}
	public void setAtiva(boolean ativa){
		this.ativa = ativa;
	}
	public boolean getAtiva(){
		return this.ativa;
	}
}
