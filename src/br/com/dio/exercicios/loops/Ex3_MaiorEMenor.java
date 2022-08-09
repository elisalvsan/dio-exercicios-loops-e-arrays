package br.com.dio.exercicios.loops;

/*
Faça um programa que leia 5 numeros e informe
o maior número e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, maior = 0, soma=0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            soma = soma +numero;

            if (numero > maior) {
                maior = numero;
            }

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }

}
