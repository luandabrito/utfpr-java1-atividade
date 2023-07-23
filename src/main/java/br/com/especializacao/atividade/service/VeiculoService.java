package br.com.especializacao.atividade.service;

import br.com.especializacao.atividade.Carga;
import br.com.especializacao.atividade.Passeio;

import java.util.ArrayList;

public class VeiculoService {

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
