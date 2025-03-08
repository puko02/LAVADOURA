package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main func = new Main();
        func.menuPrincipal();
    }

    public void menuPrincipal(){
        int opc;
        Scanner sc = new Scanner(System.in);
        MenuCliente funcC = new MenuCliente();
        MenuQuickWash funcQW = new MenuQuickWash();

        System.out.println("BEM VINDO!");
        System.out.println("Selecione a opção desejada\n");
        System.out.print(  "1 - MENU DO CLIENTE\n" +
                           "2 - MENU QUICK WASH\n" +
                           "3 - SAIR\n" +
                           " -> ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                funcC.Cliente();
                break;
            case 2:
                funcQW.QuickWash();
                break;
            case 3:
                System.out.println("Saindo...");
                return;
            default:
                return;
        }
    }

}