package br.com.especializacao.atividade;

import java.util.ArrayList;

public class BDVeiculos {

    ArrayList<Passeio> veicPasseioList = new ArrayList<>();
    ArrayList<Carga> veicCargaList = new ArrayList<>();

    public ArrayList<Passeio> getVeicPasseioList() {
        return veicPasseioList;
    }

    public void setVeicPasseioList(ArrayList<Passeio> veicPasseioList) {
        this.veicPasseioList = veicPasseioList;
    }

    public ArrayList<Carga> getVeicCargaList() {
        return veicCargaList;
    }

    public void setVeicCargaList(ArrayList<Carga> veicCargaList) {
        this.veicCargaList = veicCargaList;
    }
}
