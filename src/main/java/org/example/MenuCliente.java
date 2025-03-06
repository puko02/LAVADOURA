package org.example;
import java.util.Scanner;
import org.example.Main;

public class MenuCliente {

    public void Cliente(){
        int opc;
        Scanner sc = new Scanner(System.in);
        Main func = new Main();

        System.out.println("SERVIÇOS DA QUICK WASH\n");
        System.out.println("SELECIONE O SERVIÇO DESEJADO\n");
        System.out.print(  "1 - LAVAGEM SIMPLES\n" +
                           "2 - LAVAGEM COMPLETA\n" +
                           "3 - POLIMENTO\n" +
                           "4 - VOLTAR\n" +
                           " -> ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
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
