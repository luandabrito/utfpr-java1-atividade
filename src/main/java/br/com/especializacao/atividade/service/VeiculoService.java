package br.com.especializacao.atividade.service;

import br.com.especializacao.atividade.Carga;
import br.com.especializacao.atividade.Passeio;
import br.com.especializacao.atividade.Veiculo;

import java.util.Objects;
import java.util.Scanner;

public class VeiculoService {

    public Passeio cadastrarVeiculoPasseio(Scanner sc){
        Passeio veicPasseio = new Passeio();
        System.out.println("Cadastro de Veículos de Passeio!");
        System.out.println("Informe a quantidade de passageiros: ");
        veicPasseio.setQtdPassageiros(sc.nextInt());
        sc.nextLine();
        cadastrarVeiculo(veicPasseio, sc);
        return veicPasseio;
    }

    public Carga cadastrarVeiculoCarga(Scanner sc){
        Carga veicCarga = new Carga();
        System.out.println("Cadastro de Veículos de Carga!");
        System.out.println("Informe a carga máxima: ");
        veicCarga.setCargaMax(sc.nextInt());
        System.out.println("Informe a tara: ");
        veicCarga.setTara(sc.nextInt());
        sc.nextLine();
        cadastrarVeiculo(veicCarga, sc);
        return veicCarga;
    }

    public void cadastrarVeiculo(Veiculo veiculo, Scanner sc){
        System.out.println("Informe a marca do veículos: ");
        veiculo.setMarca(sc.nextLine());
        System.out.println("Informe o modelo do veículos: ");
        veiculo.setModelo(sc.nextLine());
        System.out.println("Informe a cor do veículos: ");
        veiculo.setCor(sc.nextLine());
        System.out.println("Informe a placa do veículos: ");
        veiculo.setPlaca(sc.nextLine());
        System.out.println("Informe a quantidade de rodas do veículos: ");
        veiculo.setQtdRodas(sc.nextInt());
        System.out.println("Informe a velocidade máxima do veículos: ");
        veiculo.setVelocMax(sc.nextFloat());
        System.out.println("Informe a potência do motor do veículos: ");
        veiculo.getMotor().setPotencia(sc.nextInt());
        System.out.println("Informe a quantidade de Pist do veículos: ");
        veiculo.getMotor().setQtdPist(sc.nextInt());
        System.out.println("Veículo cadastrado com sucesso. ");
    }
}
