package br.com.especializacao.atividade;

import br.com.especializacao.atividade.service.VeiculoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    VeiculoService passeioService = new VeiculoService();
    Scanner sc = new Scanner (System.in);
    ArrayList<Passeio> veicPasseioList = new ArrayList<>();
    ArrayList<Carga> veicCargaList = new ArrayList<>();

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
                System.out.println("Encerrando o Sistema");
                break;
            } else if (opcao == 1) {
                cadastrarVeiculoPasseio(sc);
            } else if (opcao == 2) {
                cadastrarVeiculoCarga(sc);
            } else if (opcao == 3) {
                listarVeiculosPasseio();
            } else if (opcao == 4) {
                listarVeiculosCarga();
            } else {
                System.out.println("Opção inválida.\n");
            }
        }
        sc.close();
    }

    private void cadastrarVeiculoPasseio(Scanner sc) {
        if (veicPasseioList.size() == 5) {
            System.out.println("Você já possui cinco veículos cadastrados!");
        } else {
            for (Veiculo veiculo : veicPasseioList) {
                Passeio veiculoNovo = passeioService.cadastrarVeiculoPasseio(sc);
                if (veiculoNovo.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
                    System.out.println("Você já possui esse veículo cadastrado!");
                } else {
                    veicPasseioList.add(veiculoNovo);
                }
            }
        }
    }

    private void listarVeiculosPasseio() {
        for (Veiculo veiculo : veicPasseioList) {
            System.out.println(veiculo.toString());
        }

    }

    private void cadastrarVeiculoCarga(Scanner sc) {
        if (veicCargaList.size() == 5) {
            System.out.println("Você já possui cinco veículos cadastrados!");
        } else {
            for (Veiculo veiculo : veicCargaList) {
                Carga veiculoNovo = passeioService.cadastrarVeiculoCarga(sc);
                if (veiculoNovo.getPlaca().equalsIgnoreCase(veiculo.getPlaca())){
                    System.out.println("Você já possui esse veículo cadastrado!");
                } else {
                    veicCargaList.add(veiculoNovo);
                }
            }
        }
    }

    private void listarVeiculosCarga() {
        for (Veiculo veiculo : veicCargaList) {
            System.out.println(veiculo.toString());
        }

    }

}