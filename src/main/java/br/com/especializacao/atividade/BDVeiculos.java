package br.com.especializacao.atividade;

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

    public Passeio veiculoPasseioExiste(String placa){
        for (Passeio veiculo : veicPasseioList){
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    }

    public Carga veiculoCargaExiste(String placa){
        for (Carga veiculo : veicCargaList){
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    }
}
