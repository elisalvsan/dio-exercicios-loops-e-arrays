package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */


import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantiNumeros, numero;
        int quantPares = 0, quantImpares = 0;


        System.out.println("Quantidade de números: ");
        quantiNumeros = scanner.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            if(numero % 2 == 0) {
                quantPares++;
            }else{
                quantImpares++;
            }

            count++;
        } while (count < quantiNumeros);

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpares);
    }

}
