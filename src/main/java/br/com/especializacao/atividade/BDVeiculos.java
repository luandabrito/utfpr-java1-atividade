package br.com.especializacao.atividade;

import br.com.especializacao.atividade.exceptions.VeicExistException;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {

    List<Passeio> veicPasseioList = new ArrayList<>();
    List<Carga> veicCargaList = new ArrayList<>();

    public List<Passeio> getVeicPasseioList() {
        return veicPasseioList;
    }

    public void setVeicPasseioList(Passeio veicPasseio) {
        this.veicPasseioList.add(veicPasseio);
    }

    public List<Carga> getVeicCargaList() {
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
        for (Passeio veiculo : veicPasseioList) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
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

    public void excluirVeiculo(String placa, String tipo) throws VeicExistException {
        if (tipo.equalsIgnoreCase("passeio")){
            Passeio veicLocalizado = getVeiculoPasseioPelaPlaca(placa);
            if (veicLocalizado == null){
                throw new VeicExistException("Veiculo de Passeio não localizado!");
            }
            veicPasseioList.remove(veicLocalizado);
        } else {
            Carga veicLocalizado = getVeiculoCargaPelaPlaca(placa);
            if (veicLocalizado == null){
                throw new VeicExistException("Veiculo de Carga não localizado!");
            }
            veicCargaList.remove(veicLocalizado);
        }
    }
}
