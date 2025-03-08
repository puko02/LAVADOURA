package org.example;
import java.util.ArrayList;
import java.lang.String;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	private String servicoSolicitado;
	public String status = "Pedido solicitado";
	public static ArrayList<Carro> carros = new ArrayList<>();


	public Carro() {}

	public Carro(String marca, String modelo, String cor, String placa, String servicoSolicitado, String status) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.servicoSolicitado = servicoSolicitado;
	}


	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
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

	public static Carro compararPlaca(String placa, ArrayList<Carro> carros) {
		for (Carro num : carros) {
			if (num.getPlaca().equalsIgnoreCase(placa)) { // Ignorar maiúsculas e minúsculas
				return num;
			}
		}
		return null;
	}


	public void adicionarCarro(String marca, String modelo, String cor, String placa, String servicoSolicitado, String status){
		carros.add(new Carro(marca, modelo, cor, placa, servicoSolicitado, status));
	}

	public String toString() {
		return String.format(
				"Marca: %s | Modelo: %s | Cor: %s | Placa: %s | Tipo de Lavagem: %s | Status: %s",
				marca, modelo, cor, placa, servicoSolicitado, status
		);
	}
}