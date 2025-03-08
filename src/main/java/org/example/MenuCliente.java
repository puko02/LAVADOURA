package org.example;
import java.util.Scanner;
import org.example.Main;
import org.example.LavagemSimples;

public class MenuCliente {

    public void Cliente(){
        int opc;
        Scanner sc = new Scanner(System.in);
        Main func = new Main();
        LavagemSimples funcLS = new LavagemSimples();
        LavagemCompleta funcLC = new LavagemCompleta();
        Polimento funcP = new Polimento();

        System.out.println("SERVIÇOS DA QUICK WASH\n");
        System.out.println("SELECIONE O SERVIÇO DESEJADO\n");
        System.out.print(  "1 - LAVAGEM SIMPLES - R$ 150\n" +
                           "2 - LAVAGEM COMPLETA - R$ 250\n" +
                           "3 - POLIMENTO - R$ 100\n" +
                           "4 - VOLTAR\n" +
                           " -> ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                funcLS.menuLS();
                break;
            case 2:
                funcLC.menuLC();
                break;
            case 3:
                funcP.menuP();
                break;
            case 4:
                func.menuPrincipal();
                break;
            default:
                return;
        }

    }

}
