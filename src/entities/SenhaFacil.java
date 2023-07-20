package entities;

import java.util.Random;

public class SenhaFacil {

    private int qtdNumeros;

    public SenhaFacil(int qtdNumeros) {
        this.qtdNumeros = qtdNumeros;
    }

    public int getQtdNumeros() {
        return qtdNumeros;
    }

    public void setQtdNumeros(int qtdNumeros) {
        this.qtdNumeros = qtdNumeros;
    }

    public String geradorFacil(){
        Random random = new Random();
        StringBuilder senhaFacil = new StringBuilder();
        for(int i = 0; i < qtdNumeros; i++){
            senhaFacil.append(random.nextInt(10));
        }
        return String.valueOf(senhaFacil.toString());
    }
}
