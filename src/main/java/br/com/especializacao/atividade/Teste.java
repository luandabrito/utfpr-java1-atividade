package br.com.especializacao.atividade;

import br.com.especializacao.atividade.service.VeiculoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    VeiculoService passeioService = new VeiculoService();
    Leitura l = new Leitura();
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
            int opcao = Integer.parseInt(l.entDados("Digite a opção desejada: "));
            if (opcao == 7) {
                System.out.println("Encerrando o Sistema");
                break;
            } else if (opcao == 1) {
                cadastrarVeiculoPasseio();
            } else if (opcao == 2) {
                cadastrarVeiculoCarga();
            } else if (opcao == 3) {
                listarVeiculosPasseio();
            } else if (opcao == 4) {
                listarVeiculosCarga();
            } else {
                System.out.println("Opção inválida.\n");
            }
        }
    }

    private void cadastrarVeiculoPasseio() {
        do {
            Passeio veicPasseio = new Passeio();
            System.out.println("Cadastro de Veículos de Passeio!");
            veicPasseio.setQtdPassageiros(Integer.parseInt(l.entDados("Informe a quantidade de passageiros: ")));
            cadastrarVeiculo(veicPasseio);
            if (veicPasseioList.size() == 0  || !placaExiste(veicPasseio, "passeio")) {
                veicPasseioList.add(veicPasseio);
                System.out.println("Veículo cadastrado com sucesso. ");
            }
            String opcao = l.entDados("Deseja cadastrar outro veículo de passeio? Sim ou Não ");
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

    private void cadastrarVeiculoCarga() {
        do {
            Carga veicCarga = new Carga();
            System.out.println("Cadastro de Veículos de Carga!");
            veicCarga.setCargaMax(Integer.parseInt(l.entDados("Informe a carga máxima: ")));
            veicCarga.setTara(Integer.parseInt(l.entDados("Informe a tara: ")));
            cadastrarVeiculo(veicCarga);
            if (veicCargaList.size() == 0  || !placaExiste(veicCarga, "carga")) {
                veicCargaList.add(veicCarga);
                System.out.println("Veículo cadastrado com sucesso. ");
            }
            String opcao = l.entDados("Deseja cadastrar outro veículo de passeio? Sim ou Não ");
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

    public void cadastrarVeiculo(Veiculo veiculo){
        veiculo.setMarca(l.entDados("Informe a marca do veículos: "));
        veiculo.setModelo(l.entDados("Informe o modelo do veículos: "));
        veiculo.setCor(l.entDados("Informe a cor do veículos: "));
        veiculo.setPlaca(l.entDados("Informe a placa do veículos: "));
        veiculo.setQtdRodas(Integer.parseInt(l.entDados("Informe a quantidade de rodas do veículos: ")));
        veiculo.setVelocMax(Float.parseFloat(l.entDados("Informe a velocidade máxima do veículos: ")));
        veiculo.getMotor().setPotencia(Integer.parseInt(l.entDados("Informe a potência do motor do veículos: ")));
        veiculo.getMotor().setQtdPist(Integer.parseInt(l.entDados("Informe a quantidade de Pist do veículos: ")));
    }
}