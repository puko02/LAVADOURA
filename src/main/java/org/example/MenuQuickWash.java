package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Main;

public class MenuQuickWash {

    public void QuickWash(){
        int opc;
        Scanner sc = new Scanner(System.in);
        Main func = new Main();
        ArrayList<Carro> carros = new ArrayList<>();

        System.out.println("ESCOLHA A OPÇÃO DESEJADA\n");
        System.out.print(  "1 - MENU DE VISUALIZACAO\n" +
                           "2 - MENU DE CONTROLE\n" +
                           "3 - PAGAMENTO DE SERVIÇOS\n" +
                           "4 - VOLTAR\n" +
                           " -> ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                System.out.println("Lista de carros cadastrados:");
                for(Carro carro : carros){
                    System.out.println(carro.toString());
                }
                QuickWash();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                func.menuPrincipal();
                break;
            default:
                return;
        }
    }

}
