package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Carro;

public class MenuQuickWash {

    public void QuickWash() {
        Scanner sc = new Scanner(System.in);
        Carro Carro = new Carro();
        Main func = new Main();
        int opc;

        while (true) { // Loop para manter o menu funcionando
            System.out.println("ESCOLHA A OPÇÃO DESEJADA\n");
            System.out.print("1 - MENU DE VISUALIZAÇÃO\n" +
                    "2 - MENU DE CONTROLE\n" +
                    "3 - PAGAMENTO DE SERVIÇOS\n" +
                    "4 - VOLTAR\n" +
                    " -> ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Lista de carros cadastrados:");
                    if (Carro.carros == null) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        for (Carro num : Carro.carros) {
                            System.out.println(num.toString());
                        }
                    }
                    break;
                case 2:
                    // Adicione a lógica para adicionar carros ou manipular a lista aqui
                    break;
                case 3:
                    // Lógica de pagamento
                    break;
                case 4:
                    func.menuPrincipal(); // Retorna ao menu principal
                    return; // Sai do loop e retorna ao menu principal
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
