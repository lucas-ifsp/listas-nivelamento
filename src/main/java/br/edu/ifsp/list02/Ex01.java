package br.edu.ifsp.list02;

/*
    Faça um programa que leia dados inteiros da temperatura diária durante uma semana,
    armazenando em um vetor. Na sequência, escreva quantos dias dessa semana a temperatura
    esteve acima da média. As sete temperaturas devem ser lidas na mesma linha, separada
    por espaço.

    Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 2 2 2 2 2 3 | Saída = 1
    Exemplo 2: Entrada = 21 10 13 34 30 21 34 | Saída = 3
    Exemplo 3: Entrada = 2 2 2 2 2 2 1| Saída = 6
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex01 {

    public static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {


        final int[] temperatures = new int[DAYS_IN_WEEK];
        final Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = scanner.nextInt();
        }

        final Ex01 ex01 = new Ex01();
        System.out.println(ex01.compute(temperatures));
    }

    int compute(int[] temperatures) {
        int temperaturesAboveAverage = 0;
        double sumOfTemperatures = 0;

        for (int temperature : temperatures)
            sumOfTemperatures += temperature;

        final double meanOfTemperatures = sumOfTemperatures / DAYS_IN_WEEK;

        for (int temperature : temperatures)
            if(temperature > meanOfTemperatures) temperaturesAboveAverage++;

        return temperaturesAboveAverage;
    }
}
