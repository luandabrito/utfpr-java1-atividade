package br.com.especializacao.atividade;

final public class Passeio extends Veiculo {

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

    public Passeio criarVeiculoPasseio(String marca, String modelo, String placa, String cor,
                                       float velocMax, int qtdRodas, int potencia, int qtdPist, int qtdPassageiros) {
        Passeio veicPasseio = new Passeio();
        veicPasseio.setMarca(marca);
        veicPasseio.setModelo(modelo);
        veicPasseio.setPlaca(placa);
        veicPasseio.setCor(cor);
        veicPasseio.setVelocMax(velocMax);
        veicPasseio.setQtdRodas(qtdRodas);
        veicPasseio.getMotor().setPotencia(potencia);
        veicPasseio.getMotor().setQtdPist(qtdPist);
        veicPasseio.setQtdPassageiros(qtdPassageiros);
        return veicPasseio;
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
                ", Quantidade de passageiros: " + qtdPassageiros +
                " }";
    }

}
