//package POO_trab.src.model;

public class Transacao {
	private String tipo;
	private int contaOri;
	private int contaDest;
	private String data;
	private double valor;
	private String canal;
	
	public Transacao(String tipo, int contaOri, int contaDest, String data, double valor, String canal) {
		this.tipo = tipo;
		this.contaOri = contaOri;
		this.contaDest = contaDest;
		this.data = data;
		this.valor = valor;
		this.canal = canal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getContaOri() {
		return contaOri;
	}

	public void setContaOri(int contaOri) {
		this.contaOri = contaOri;
	}

	public int getContaDest() {
		return contaDest;
	}

	public void setContaDest(int contaDest) {
		this.contaDest = contaDest;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}
}
