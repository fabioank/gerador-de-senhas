package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SenhaDificil extends SenhaMedia{

    private int qtdCaracteres;

    public SenhaDificil(int qtdNumeros, int qtdLetras, int qtdCaracteres) {
        super(qtdNumeros, qtdLetras);
        this.qtdCaracteres = qtdCaracteres;
    }

    public int getQtdCaracteres() {
        return qtdCaracteres;
    }

    public void setQtdCaracteres(int qtdCaracteres) {
        this.qtdCaracteres = qtdCaracteres;
    }
    public String geradorDificil(){

        List<Character> list = new ArrayList<>();

        String senha = super.geradorMedio();
        String caracteresEspeciais = "!@#$%^&*()_-+={}[]|";
        Random ramdom = new Random();

        for(int i = 0; i < qtdCaracteres; i++){
            int posicaoAleatoria = ramdom.nextInt(caracteresEspeciais.length());
            senha += caracteresEspeciais.charAt(posicaoAleatoria);
        }
        for(int i = 0; i < senha.length(); i++){
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
