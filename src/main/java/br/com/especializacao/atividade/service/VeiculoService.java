package br.com.especializacao.atividade.service;

import br.com.especializacao.atividade.Carga;
import br.com.especializacao.atividade.Passeio;
import br.com.especializacao.atividade.Veiculo;

import java.util.ArrayList;

public class VeiculoService {

    public boolean placaExiste(Veiculo veiculoNovo, ArrayList<Passeio> passeiosList, ArrayList<Carga> cargasList ){
        for (Veiculo veiculo : passeiosList) {
            if (veiculo.getPlaca().equalsIgnoreCase(veiculoNovo.getPlaca())){
                System.out.println("Você já possui um veículo cadastrado com a placa: " + veiculoNovo.getPlaca());
                return true;
            }
        }
        for (Veiculo veiculo : cargasList) {
            if (veiculo.getPlaca().equalsIgnoreCase(veiculoNovo.getPlaca())){
                System.out.println("Você já possui um veículo cadastrado com a placa: " + veiculoNovo.getPlaca());
                return true;
            }
        }
        return false;
    }

    public Passeio veiculoPasseioExiste(ArrayList<Passeio> passeiosList, String placa){
        for (Passeio veiculo : passeiosList){
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    }

    public Carga veiculoCargaExiste(ArrayList<Carga> cargasList, String placa){
        for (Carga veiculo : cargasList){
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    }

}
