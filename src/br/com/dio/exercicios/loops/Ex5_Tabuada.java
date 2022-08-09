package br.com.dio.exercicios.loops;

/*
Desenvolva um gerador de tabuada, capaz de gerar
a tabuada de qualquer número inteiro entre 1 a 10.
O usuario deve informar de qual número ele deseja
ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 2 = 10
*/

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada de " + tabuada + ": ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada *i));
        }

    }

}
