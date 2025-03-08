package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Carro;
import java.lang.String;

public class LavagemSimples extends Servico {

	public LavagemSimples(){}

	public LavagemSimples(double preco, String descricao) {
		super(preco, descricao);
	}

	public void menuLS(){
		MenuCliente menuCliente = new MenuCliente();
		Carro Carro = new Carro();
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a marca do seu carro?");
		String marca = sc.nextLine();

		System.out.println("Qual o modelo do seu carro?");
		String modelo = sc.nextLine();

		System.out.println("Qual a cor do seu carro?");
		String cor = sc.nextLine();

		System.out.println("Qual a placa do seu carro?");
		String placa = sc.nextLine();

		if(Carro.compararPlaca(placa, Carro.carros) != null)
		{
			System.out.println("Carro já está cadastrado.");
		}else{;
			Carro.adicionarCarro(marca, modelo, cor, placa, "Lavagem Simples", "Pedido solicitado");
			System.out.println("Carro cadastrado com sucesso!");
		}

		// Exibir os carros cadastrados de forma organizada
		System.out.println("Lista de carros cadastrados:");
		for(Carro num : Carro.carros){
			System.out.println(num.toString());
		}

		menuCliente.Cliente();
		return;

	}
}