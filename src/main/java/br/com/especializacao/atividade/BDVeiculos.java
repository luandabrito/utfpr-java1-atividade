package br.com.especializacao.atividade;

import br.com.especializacao.atividade.exceptions.VeicExistException;

import java.util.ArrayList;

public class BDVeiculos {

    ArrayList<Passeio> veicPasseioList = new ArrayList<>();
    ArrayList<Carga> veicCargaList = new ArrayList<>();

    public ArrayList<Passeio> getVeicPasseioList() {
        return veicPasseioList;
    }

    public void setVeicPasseioList(Passeio veicPasseio) {
        this.veicPasseioList.add(veicPasseio);
    }

    public ArrayList<Carga> getVeicCargaList() {
        return veicCargaList;
    }

    public void setVeicCargaList(Carga veicCarga) {
        this.veicCargaList.add(veicCarga);
    }

    public void veiculoPasseioExiste(String placa) throws VeicExistException {
        if (getVeiculoPasseioPelaPlaca(placa) != null) {
            throw new VeicExistException("Já existe um veículo de passeio com esta plata: " + placa);
        }
    }

    public Passeio getVeiculoPasseioPelaPlaca(String placa) {
        for (Passeio veiculo : veicPasseioList){
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    }

    public void veiculoCargaExiste(String placa) throws VeicExistException {
        if (getVeiculoCargaPelaPlaca(placa) != null) {
            throw new VeicExistException("Já existe um veículo de carga com esta plata: " + placa);
        }
    }

    public Carga getVeiculoCargaPelaPlaca(String placa) {
        for (Carga veiculo : veicCargaList){
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    }
}
