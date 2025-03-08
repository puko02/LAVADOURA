package org.example;
import java.util.Scanner;
import org.example.Carro;

public class Funcionario {

	public void Funcionario() {
		Scanner sc = new Scanner(System.in);
		Carro Carro = new Carro();
		MenuQuickWash menuQW = new MenuQuickWash();

		while (true) {
			System.out.println("MENU DE CONTROLE DE VEÍCULOS");
			System.out.println("VEÍCULOS CADASTRADOS");

			if (Carro.carros == null || Carro.carros.isEmpty()) {
				System.out.println("Nenhum carro cadastrado.");
			} else {
				int index = 1; // Variável para numerar os carros, começando do 1
				for (Carro carro : Carro.carros) {
					System.out.println("Carro " + index + ": " + carro.toString());
					index++; // Incrementa o índice

				}
				System.out.println("Selecione o veículo que deseja iniciar o processo de lavagem");
				System.out.println("Digite 0 para voltar");
				int carroSelecionado = sc.nextInt();
				sc.nextLine();

				carroSelecionado = carroSelecionado - 1;
				if(carroSelecionado == -1){
					menuQW.QuickWash();
					return;
				}

				if (carroSelecionado >= 0 && carroSelecionado <= Carro.carros.size()) {
					Carro carroEscolhido = Carro.carros.get(carroSelecionado); // Ajusta o índice
					if(carroEscolhido.status == "Lavagem em andamento"){
						System.out.println("Deseja concluir o processo de lavagem? (1 para SIM e 2 para NAO)");
						int r = sc.nextInt();
						sc.nextLine();
						if(r == 1){
							carroEscolhido.setStatus("Lavagem concluída");
							System.out.println("O status do carro foi atualizado: " + carroEscolhido);
							menuQW.QuickWash();
							return;
						}
					}else {
						carroEscolhido.setStatus("Lavagem em andamento");
						System.out.println("O status do carro foi atualizado: " + carroEscolhido);
						menuQW.QuickWash();
						return;
					}
				} else {
					System.out.println("Seleção inválida.");
				}
			}
		}
	}
}
