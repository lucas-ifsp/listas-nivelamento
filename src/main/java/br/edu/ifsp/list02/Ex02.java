package br.edu.ifsp.list02;

/*
    Faça um programa que construa dois vetores A e B de 5 posições, lendo e
    adicionando valores inteiros a esses vetores. Crie um terceiro vetor C,
    composto pela soma dos elementos de A e B. Por exemplo:

    C[0] = A[0] + B[0]
    C[1] = A[1] + B[1]

    Após isso, escreva o conteúdo do vetor C, separados por vírgula.
    Qualquer situação fora do domínio de entrada resulta em saída uma “Erro”.

    Exemplos de entrada e saída esperada:

    Entrada = 2 5 8 34 5               | Saída = 10, 56, 10, 50, 10
              8 51 2 16 5
    Entrada = -10 0 10 20 30           | Saída = 90, 50, 10, -30, -70
              100 50 0 -50 -100
*/

import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class Ex02 {

    public static final int NUM_VALUES = 5;

    public static void main(String[] args) {
        final int[] arrayA = new int[NUM_VALUES];
        final int[] arrayB = new int[NUM_VALUES];
        final Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayA.length; i++)
            arrayA[i] = scanner.nextInt();

        for (int i = 0; i < arrayB.length; i++)
            arrayB[i] = scanner.nextInt();

        final Ex02 ex02 = new Ex02();
        System.out.println(ex02.compute(arrayA, arrayB));
    }

    String compute(int[] arrayA, int[] arrayB) {
        final var arrayC = new int[NUM_VALUES];

        for (int i = 0; i < arrayC.length; i++) {
            if(sumOverflowsOrUnderflows(arrayA[i], arrayB[i])) return "Erro";
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        final var joiner = new StringJoiner(", ");
        for (int value : arrayC) joiner.add(String.valueOf(value));

        return joiner.toString();
    }

    private static boolean sumOverflowsOrUnderflows(int aNumber, int otherNumber) {
        return (long) aNumber + otherNumber > Integer.MAX_VALUE ||
                (long) aNumber + otherNumber < Integer.MIN_VALUE;
    }
}
