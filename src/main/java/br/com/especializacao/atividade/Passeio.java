package br.com.especializacao.atividade;

final public class Passeio extends Veiculo implements Calcular {

    private int qtdPassageiros;

    public Passeio() {
        this.qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    final public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 1000;
    }

    @Override
    public int calcular() {
        return this.getPlaca().length() + this.getMarca().length() + this.getModelo().length() + this.getCor().length();
    }
    @Override
    public String toString() {
        return "Veiculo de Carga { " +
                "Placa: " + super.getPlaca() +
                ", Marca: " + super.getMarca() +
                ", Modelo: " + super.getModelo() +
                ", Cor: " + super.getCor() +
                ", Velocidade Maxima em km/h: " + super.getVelocMax() +
                ", Velocidade Maxima em m/h: " + this.calcVel(super.getVelocMax()) +
                ", Quantidade de rodas: " + super.getQtdRodas() +
                ", Potencia do Motor: " + super.getMotor().getPotencia() +
                ", Quantidade de Pist do Motor: " + super.getMotor().getQtdPist() +
                ", Quantidade de passageiros: " + this.getQtdPassageiros() +
                ", Valor calculado Interface: " + this.calcular() +
                " }";
    }

}
