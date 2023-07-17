package br.com.especializacao.atividade;

final public class Carga extends Veiculo {

    private int cargaMax;
    private int tara;

    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public int getTara() {
        return tara;
    }

    final public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    final public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 100000;
    }

    public Carga criarVeiculoCarga(String marca, String modelo, String placa, String cor,
                                   float velocMax, int qtdRodas, int potencia, int qtdPist, int cargaMax, int tara){
        Carga veicCarga = new Carga();
        veicCarga.setMarca(marca);
        veicCarga.setModelo(modelo);
        veicCarga.setPlaca(placa);
        veicCarga.setCor(cor);
        veicCarga.setVelocMax(velocMax);
        veicCarga.setQtdRodas(qtdRodas);
        veicCarga.getMotor().setPotencia(potencia);
        veicCarga.getMotor().setQtdPist(qtdPist);
        veicCarga.setCargaMax(cargaMax);
        veicCarga.setTara(tara);
        return veicCarga;
    }

    @Override
    public String toString() {
        return "Veiculo de Carga { " +
                "Marca: " + super.getMarca() +
                ", Modelo: " + super.getModelo() +
                ", Cor: " + super.getCor() +
                ", Placa: " + super.getPlaca() +
                ", Quantidade de rodas: " + super.getQtdRodas() +
                ", Velocidade Maxima: " + calcVel(super.getVelocMax()) +
                ", Potencia do Motor: " + super.getMotor().getPotencia() +
                ", Quantidade de Pist do Motor: " + super.getMotor().getQtdPist() +
                ", CargaMax: " + cargaMax +
                ", Tara: " + tara +
                " }";
    }

}
