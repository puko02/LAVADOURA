
public class Carro {

	private String modelo;
	
	private String cor;
	
	private String placa;
	
	private String servicoSolicitado;
	
	private String status;



	public Carro() {
	
	}
	
	public Carro(String modelo, String cor, String placa, String servicoSolicitado, String status) {
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.servicoSolicitado = servicoSolicitado;
		this.status = status;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return this.modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getServicoSolicitado() {
		return this.servicoSolicitado;
	}
	
	public void setServicoSolicitado(String servicoSolicitado) {
		this.servicoSolicitado = servicoSolicitado;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}