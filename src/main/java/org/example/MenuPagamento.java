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
                            if (carroEscolhido.getServicoSolicitado() == "Lavagem Completa") {
                                int valorDoServico = 250;
                                double valorPago;
                                double troco;

                                System.out.println("Valor do Serviço: R$" + valorDoServico
                                        + "\n Digite o valor que será pago: ");
                                valorPago = sc.nextDouble();
                                sc.nextLine();

                                troco = valorPago - valorDoServico;

                                System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                        +" foi concluido!"
                                        +"\n Seu Troco foi de: " + troco +"\n");
                                menuQW.QuickWash();
                                return;

                            } else if(carroEscolhido.getServicoSolicitado() == "Lavagem Simples"){
                                int valorDoServico = 150;
                                double valorPago;
                                double troco;

                                System.out.println("Valor do Serviço: R$" + valorDoServico
                                    + "\n Digite o valor que será pago: ");
                                valorPago = sc.nextDouble();
                                sc.nextLine();

                                troco = valorPago - valorDoServico;

                                System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                        +" foi concluido!"
                                        +"\n Seu Troco foi de: " + troco +"\n");
                                menuQW.QuickWash();
                                return;

                            } else if(carroEscolhido.getServicoSolicitado() == "Polimento"){
                                int valorDoServico = 100;
                                double valorPago;
                                double troco;

                                System.out.println("Valor do Serviço: R$" + valorDoServico
                                        + "\n Digite o valor que será pago: ");
                                valorPago = sc.nextDouble();
                                sc.nextLine();

                                troco = valorPago - valorDoServico;

                                System.out.println("O pagamento para o " + carroEscolhido.getModelo() + " de placa: "+ carroEscolhido.getPlaca()
                                        +" foi concluido!"
                                        +"\n Seu Troco foi de: " + troco +"\n");
                                menuQW.QuickWash();
                                return;
                            }
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
            }
        }
    }

