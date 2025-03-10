package org.example;
import java.util.Scanner;
import org.example.Main;

public class MenuPagamento {
    public void Pagamento() {

        Scanner sc = new Scanner(System.in);
        Carro Carro = new Carro();
        MenuQuickWash menuQW = new MenuQuickWash();

        while (true) {
            System.out.println("MENU DE PAGAMENTO");
            System.out.println("VEÍCULOS CADASTRADOS");

                    if (Carro.carros == null || Carro.carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                        menuQW.QuickWash();
                        return;
                    } else {
                        int index = 1; // Variável para numerar os carros, começando do 1
                        for (Carro carro : Carro.carros) {
                            System.out.println("Carro " + index + ": " + carro.toString());
                            index++; // Incrementa o índice

                        }
                        System.out.println("\nSelecione o veículo que deseja iniciar o processo de pagamento: ");
                        System.out.println("Digite 0 para voltar" +
                                "\n->");

                        int carroSelecionado = sc.nextInt();
                        sc.nextLine();

                        carroSelecionado = carroSelecionado - 1;

                        //Operacao de voltar pro menu anterior
                        if (carroSelecionado == -1) {
                            menuQW.QuickWash();
                            return;
                        }
                        //Operacao para prosseguir com o pagamento

                        if (carroSelecionado >= 0 && carroSelecionado <= Carro.carros.size()) {
                            Carro carroEscolhido = Carro.carros.get(carroSelecionado); // Ajusta o índice
                            if (carroEscolhido.getServicoSolicitado().equalsIgnoreCase("Lavagem Completa") && carroEscolhido.getStatus().equalsIgnoreCase("Lavagem concluída")) {
                                int valorDoServico = 250;
                                double valorPago;
                                double troco;

                                System.out.println("Valor do Serviço: R$" + valorDoServico
                                        + "\n Digite o valor que será pago: ");
                                valorPago = sc.nextDouble();
                                sc.nextLine();
                                if(valorPago > valorDoServico){
                                    troco = valorPago - valorDoServico;
                                    System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                                    +" foi concluido!"
                                                    +"\n Seu Troco foi de: R$" + troco
                                                    +"\n Volte Sempre!\n");
                                    menuQW.QuickWash();
                                    return;
                                }else if(valorPago == valorDoServico){
                                    System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                            +" foi concluido!"
                                            +"\n Volte Sempre!\n");
                                    menuQW.QuickWash();
                                    return;
                                }else {
                                    System.out.println("O valor Pago é inferior ao valor do serviço, por favor tente novamente.");
                                }

                            } else if(carroEscolhido.getServicoSolicitado().equalsIgnoreCase("Lavagem Simples") && carroEscolhido.getStatus().equalsIgnoreCase("Lavagem concluída")){
                                int valorDoServico = 150;
                                double valorPago;
                                double troco;

                                System.out.println("Valor do Serviço: R$" + valorDoServico
                                    + "\n Digite o valor que será pago: ");
                                valorPago = sc.nextDouble();
                                sc.nextLine();

                                if(valorPago > valorDoServico){
                                    troco = valorPago - valorDoServico;
                                    System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                            +" foi concluido!"
                                            +"\n Seu Troco foi de: R$" + troco
                                            +"\n Volte Sempre!\n");
                                    menuQW.QuickWash();
                                    return;
                                }else if(valorPago == valorDoServico){
                                    System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                            +" foi concluido!"
                                            +"\n Volte Sempre!\n");
                                    menuQW.QuickWash();
                                    return;
                                }else {
                                    System.out.println("O valor Pago é inferior ao valor do serviço, por favor tente novamente.");
                                }

                            } else if(carroEscolhido.getServicoSolicitado().equalsIgnoreCase("Polimento") && carroEscolhido.getStatus().equalsIgnoreCase("Lavagem concluída")){
                                int valorDoServico = 100;
                                double valorPago;
                                double troco;

                                System.out.println("Valor do Serviço: R$" + valorDoServico
                                        + "\n Digite o valor que será pago: ");
                                valorPago = sc.nextDouble();
                                sc.nextLine();

                                if(valorPago > valorDoServico){
                                    troco = valorPago - valorDoServico;
                                    System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                                    +" foi concluido!"
                                                    +"\n Seu Troco foi de: R$" + troco
                                                    +"\n Volte Sempre!\n");
                                    menuQW.QuickWash();
                                    return;
                                }else if(valorPago == valorDoServico){
                                    System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                            +" foi concluido!"
                                            +"\n Volte Sempre!\n");
                                    menuQW.QuickWash();
                                    return;
                                }else {
                                    System.out.println("O valor Pago é inferior ao valor do serviço, por favor tente novamente.");
                                }
                            }else{
                                System.out.println("A Lavagem ainda não foi concluída! Volte mais tarde.");
                            }
                        }else {
                            System.out.println("Opção inválida.");
                        }
                    }
            }
        }
    }

