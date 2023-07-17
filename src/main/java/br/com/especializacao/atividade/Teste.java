package br.com.especializacao.atividade;

import br.com.especializacao.atividade.service.PasseioService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    PasseioService passeioService = new PasseioService();
    Scanner sc = new Scanner (System.in);
    ArrayList<Passeio> veicPasseioList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Teste obj = new Teste();
        obj.menu();

    }

    public void menu(){

        while(true) {
            System.out.println("Sistema de Gestão de Veículos - Menu Inicial");
            System.out.println("1 - Cadastrar Veículo de Passeio");
            System.out.println("2 - Cadastrar Veículos de Carga");
            System.out.println("3 - Imprimir Todos os Veículos de Passeio");
            System.out.println("4 - Imprimir Todos os Veículos de Carga");
            System.out.println("5 - Imprimir Veículo de Passeio pela Placa");
            System.out.println("6 - Imprimir Veículo de Carga pela Placa");
            System.out.println("7 - Sair do Sistema");
            int opcao = sc.nextInt();
            sc.nextLine(); //Limpa o buffer
            if (opcao == 7) {
                break;
            } else if (opcao == 1) {
                cadastrarVeiculoPasseio(sc);
            } else if (opcao == 3) {
                listarVeiculosPasseio();
            } else {
                    System.out.println("Opção inválida.\n");
            }
        }
        sc.close();
    }

    private void cadastrarVeiculoPasseio(Scanner sc) {
        if (veicPasseioList.size() == 5) {
            System.out.println("Você já tem cinco veículos cadastrados!");
        } else {
            veicPasseioList.add(passeioService.cadastrarVeiculoPasseio(sc));
        }
    }

    private void listarVeiculosPasseio() {
        for (Veiculo veiculo : veicPasseioList) {
            System.out.println(veiculo.toString());
        }

    }


}