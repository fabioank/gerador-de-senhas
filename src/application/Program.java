package application;

import entities.SenhaDificil;
import entities.SenhaFacil;
import entities.SenhaMedia;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = "";

        System.out.println("*******GERADOR DE SENHAS DE 8 DIGITOS*******\n");
        System.out.println("Qual o nivel de segurança desejado para a senha? \n");
        System.out.println("1 - Senha Facil (Numeros)");
        System.out.println("2 - Senha Media (Numeros e Letras)");
        System.out.println("3 - Senha Dificil (Numeros, Letras e Caracteres especiais)");
        int senha = scan.nextInt();
        scan.nextLine();

        if(senha == 1){
            SenhaFacil senhaFacil = new SenhaFacil(8);
            password = senhaFacil.geradorFacil();
        }
        if(senha == 2){
            SenhaMedia senhaMedia = new SenhaMedia(4, 4);
            password = senhaMedia.geradorMedio();
        }
        if(senha == 3){
            SenhaDificil senhaDificil = new SenhaDificil(3, 3, 2);
            password = senhaDificil.geradorDificil();
        }

        System.out.println("A senha gerada foi: " + password);
    }
}
