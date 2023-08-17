package br.senai.sp.pedrapapel;

import java.util.Random;
import java.util.Scanner;

public class Pedrapepel {
    public static void main(String[] args) {

        int aleatorio;
        int number;
        String nome;
        boolean continuar = true;


        Scanner tecaldo = new Scanner(System.in);
        Random random = new Random();


            System.out.println("digite seu nome");
            nome = tecaldo.next();
            System.out.println("digite uma jogada [1-pedra 2-papel  3-tesoura]");
            number = tecaldo.nextInt();

            aleatorio = random.nextInt(3) + 1;


            if (number == aleatorio) {
                System.out.println("Empate!");
            } else if (number == 1 && aleatorio == 2 || number == 2 && aleatorio == 3) {
                System.out.println("pc ganhou");
            } else {
                System.out.println("voce ganhou!");
            }

            switch (aleatorio) {
                case 1:
                    System.out.println("o pc escolheu pedra");
                    break;
                case 2:
                    System.out.println("o pc escolheu papel");

                    break;

                case 3:
                    System.out.println("o pc escolheu tesoura");
                    break;
            }

    }
}
