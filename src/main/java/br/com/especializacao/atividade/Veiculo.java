package br.com.especializacao.atividade;

import br.com.especializacao.atividade.exceptions.VelocException;
import static br.com.especializacao.atividade.util.Constantes.MENSAGEM_VELOCIDADE_MAXIMA;

public abstract class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;

    public Veiculo(){
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        this.velocMax = 0;
        this.qtdRodas = 0;
        this.motor = new Motor();
    }

    public abstract float calcVel(float velocMax);

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    final public void setPlaca(String placa) {
        this.placa = placa;
    }

    final public void setMarca(String marca) {
        this.marca = marca;
    }

    final public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    final public void setCor(String cor) {
        this.cor = cor;
    }

    final public void setVelocMax(float velocMax, String tipo) throws VelocException {
        if (velocMax < 80 || velocMax > 110){
            if (tipo.equals("passeio")){
                this.velocMax = 100;
            } else {
                this.velocMax = 90;
            }
            throw new VelocException(MENSAGEM_VELOCIDADE_MAXIMA);
        } else {
            this.velocMax = velocMax;
        }
    }

    final public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    final public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
