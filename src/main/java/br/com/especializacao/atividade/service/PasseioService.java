package br.com.especializacao.atividade.service;

import br.com.especializacao.atividade.Passeio;

import java.util.Scanner;

public class PasseioService {

    public Passeio cadastrarVeiculoPasseio(Scanner sc){
        Passeio veicPasseio = new Passeio();
        System.out.println("Cadastro de Veículos de Passeio!");
        System.out.println("Informe a marca do veículos: ");
        veicPasseio.setMarca(sc.nextLine());
        System.out.println("Informe o modelo do veículos: ");
        veicPasseio.setModelo(sc.nextLine());
        System.out.println("Informe a cor do veículos: ");
        veicPasseio.setCor(sc.nextLine());
        System.out.println("Informe a placa do veículos: ");
        veicPasseio.setPlaca(sc.nextLine());
        System.out.println("Informe a quantidade de rodas do veículos: ");
        veicPasseio.setQtdRodas(sc.nextInt());
        System.out.println("Informe a velocidade máxima do veículos: ");
        veicPasseio.setVelocMax(sc.nextFloat());
        System.out.println("Informe a potência do motor do veículos: ");
        veicPasseio.getMotor().setPotencia(sc.nextInt());
        System.out.println("Informe a quantidade de Pist do veículos: ");
        veicPasseio.getMotor().setQtdPist(sc.nextInt());
        System.out.println("Informe a quantidade de passageiros: ");
        veicPasseio.setQtdPassageiros(sc.nextInt());
        return veicPasseio;
    }
}
