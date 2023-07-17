package br.com.especializacao.atividade;

public class Motor {

    private int qtdPist;
    private int potencia;

    public Motor(){
        this.qtdPist = 0;
        this.potencia = 0;
    }

    public int getQtdPist() {
        return qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    final public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    final public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
