package org.example;
import java.util.ArrayList;

public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	private String servicoSolicitado;
	private String status;

	public Carro() {}

	public Carro(String marca, String modelo, String cor, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}

	public Carro(String marca, String modelo, String cor, String placa, String servicoSolicitado) {
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

	public static Carro compararPlaca(String placa, ArrayList<Carro> carros){
		for(Carro num: carros){
			if(num.getPlaca().equalsIgnoreCase(placa)){ // Ignorar maiúsculas e minúsculas
				return num;
			}
		}
		return null;
	}

	public String toString() {
		return String.format("Marca: %s | Modelo: %s | Cor: %s | Placa: %s | Tipo de Lavagem: %s", marca, modelo, cor, placa, servicoSolicitado);
	}
}