package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 numeros inteiros e
mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {6, -8, 4, 65, 6, 10};

        System.out.println("Vetor: ");
        int count = 0;
        while (count < vetor.length) {
            System.out.println(vetor[count] + "");
            count++;
        }

        System.out.println("\nVetor Inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }

}
