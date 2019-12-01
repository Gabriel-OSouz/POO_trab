//package POO_trab.src.model;

public class Agencia
{
	private  String num;
	private String nomeFicticio;	
	private Endereco end;
	private String cpfGerente;
	
	public Agencia( String num, String nomeFicticio, Endereco end, String cpfGerente){
		this.num = num;
		this.nomeFicticio = nomeFicticio;
		this.end = end;
		this.cpfGerente = cpfGerente;
	}
	public String getnum() {
	       return num;
	}
	public void setnum( String num) {
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
}
