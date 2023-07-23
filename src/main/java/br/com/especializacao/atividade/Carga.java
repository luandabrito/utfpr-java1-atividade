package br.com.especializacao.atividade;

final public class Carga extends Veiculo implements Calcular {

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

    @Override
    public int calcular() {
        return this.getQtdRodas() + this.getMotor().getPotencia() + this.getMotor().getQtdPist() + this.getCargaMax() + this.getTara();
    }

    @Override
    public String toString() {
        return "Veiculo de Carga { " +
                "Placa: " + super.getPlaca() +
                ", Marca: " + super.getMarca() +
                ", Modelo: " + super.getModelo() +
                ", Cor: " + super.getCor() +
                ", Velocidade Maxima em km/h: " + super.getVelocMax() +
                ", Velocidade Maxima em cm/h: " + calcVel(super.getVelocMax()) +
                ", Quantidade de rodas: " + super.getQtdRodas() +
                ", Potencia do Motor: " + super.getMotor().getPotencia() +
                ", Quantidade de Pist do Motor: " + super.getMotor().getQtdPist() +
                ", CargaMax: " + cargaMax +
                ", Tara: " + tara +
                ", Valor calculado Interface: " + calcular() +
                " }";
    }
}
