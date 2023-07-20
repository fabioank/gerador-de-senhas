package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SenhaMedia extends SenhaFacil{

    private int qtdLetras;

    public SenhaMedia(int qtdNumeros, int qtdLetras) {
        super(qtdNumeros);
        this.qtdLetras = qtdLetras;
    }

    public int getQtdLetras() {
        return qtdLetras;
    }

    public void setQtdLetras(int qtdLetras) {
        this.qtdLetras = qtdLetras;
    }

    public String geradorMedio() {

        List<Character> list = new ArrayList<>();

        String senha = super.geradorFacil();
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < qtdLetras; i++) {
            int numeroAleatorio = random.nextInt(26);
            senha += letras.charAt(numeroAleatorio);
        }

        for (int i = 0; i < senha.length(); i++) {
            list.add(senha.charAt(i));
        }

        Collections.shuffle(list);
        String senhaPronta = "";

        for(Character l : list){
            senhaPronta += l;
        }
        return senhaPronta;
    }
}
