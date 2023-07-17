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
            System.out.println("\nSistema de Gestão de Veículos - Menu Inicial");
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
        do {
            Passeio veiculoNovo = passeioService.cadastrarVeiculoPasseio(sc);
            if (veicPasseioList.size() == 0  || !placaExiste(veiculoNovo, "passeio")) {
                veicPasseioList.add(veiculoNovo);
                System.out.println("Veículo cadastrado com sucesso. ");
            }
            System.out.println("Deseja cadastrar outro veículo de passeio? Sim ou Não ");
            String opcao = sc.nextLine();
            if (opcao.equalsIgnoreCase("não")){
                break;
            }
            if (veicPasseioList.size() == 5) {
                System.out.println("Você atingiu o limite máximo de cinco veículos cadastrados!");
            }
        } while (veicPasseioList.size() < 5);
    }

    private void listarVeiculosPasseio() {
        for (Veiculo veiculo : veicPasseioList) {
            System.out.println(veiculo.toString());
        }
    }

    private void cadastrarVeiculoCarga(Scanner sc) {
        do {
            Carga veiculoNovo = passeioService.cadastrarVeiculoCarga(sc);
            if (veicCargaList.size() == 0  || !placaExiste(veiculoNovo, "carga")) {
                veicCargaList.add(veiculoNovo);
                System.out.println("Veículo cadastrado com sucesso. ");
            }
            System.out.println("Deseja cadastrar outro veículo de passeio? Sim ou Não ");
            String opcao = sc.nextLine();
            if (opcao.equalsIgnoreCase("não")){
                break;
            }
            if (veicCargaList.size() == 5) {
                System.out.println("Você atingiu o limite máximo de cinco veículos cadastrados!");
            }
        } while (veicCargaList.size() < 5);

    }

    private void listarVeiculosCarga() {
        for (Veiculo veiculo : veicCargaList) {
            System.out.println(veiculo.toString());
        }
    }

    private boolean placaExiste(Veiculo veiculoNovo, String tipoVeiculo){
        if (tipoVeiculo.equalsIgnoreCase("carga")) {
            for (Veiculo veiculo : veicCargaList) {
                if (veiculo.getPlaca().equalsIgnoreCase(veiculoNovo.getPlaca())){
                    System.out.println("Você já possui esse veículo cadastrado!");
                    return true;
                }
            }
        }
        if (tipoVeiculo.equalsIgnoreCase("passeio")) {
            for (Veiculo veiculo : veicPasseioList) {
                if (veiculo.getPlaca().equalsIgnoreCase(veiculoNovo.getPlaca())){
                    System.out.println("Você já possui esse veículo cadastrado!");
                    return true;
                }
            }
        }
        return false;
    }


}