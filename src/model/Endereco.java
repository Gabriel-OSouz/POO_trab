package model;

public class Endereco {
	private String logradouro;
	private String CEP;
	private String cidade;
	private String bairro;
	private int num;
	private String complemento;
	private String estado;
	
	public Endereco(String logradouro, String cEP, String cidade, String bairro, int num, String complemento,
			String estado) {
		super();
		this.logradouro = logradouro;
		CEP = cEP;
		this.cidade = cidade;
		this.bairro = bairro;
		this.num = num;
		this.complemento = complemento;
		this.estado = estado;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
