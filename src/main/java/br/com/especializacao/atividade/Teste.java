package br.com.especializacao.atividade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) throws IOException {

        List<Veiculo> veiculosList = new ArrayList<>();
        Passeio passeio = new Passeio();
        Carga carga = new Carga();

        veiculosList.add(passeio.criarVeiculoPasseio("Fiat", "UNO", "ABC0000", "Branca",
                200, 5, 20, 4, 5));
        veiculosList.add(passeio.criarVeiculoPasseio("Ford", "Ka", "ABC1111", "Preta",
                200, 5, 20, 4, 5));
        veiculosList.add(passeio.criarVeiculoPasseio("Hyundai", "Hb20", "ABC2222", "Vermelha",
                200, 5, 20, 4, 5));
        veiculosList.add(passeio.criarVeiculoPasseio("Hyundai", "Creta", "ABC3333", "Cinza",
                200, 5, 20, 4, 5));
        veiculosList.add(passeio.criarVeiculoPasseio("Hyundai", "Ix35", "ABC4444", "Azul",
                200, 5, 20, 4, 5));

        veiculosList.add(carga.criarVeiculoCarga("Ford", "Caminhão 1", "ABC5555", "Preta",
                1, 15, 20, 4, 5, 2));
        veiculosList.add(carga.criarVeiculoCarga("Fiat", "Caminhão 2", "ABC6666", "Azul",
                164, 15, 20, 4, 5, 2));
        veiculosList.add(carga.criarVeiculoCarga("Ford", "Caminhão 3", "ABC7777", "Branco",
                164, 15, 20, 4, 5, 2));
        veiculosList.add(carga.criarVeiculoCarga("Fiat", "Caminhão 4", "ABC8888", "Cinza",
                164, 15, 20, 4, 5, 2));
        veiculosList.add(carga.criarVeiculoCarga("Ford", "Caminhão 5", "ABC9999", "Amarelo",
                164, 15, 20, 4, 5, 2));

        for (Veiculo veiculo : veiculosList) {
            System.out.println(veiculo.toString());
        }
    }


}