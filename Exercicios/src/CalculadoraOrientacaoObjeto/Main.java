package CalculadoraOrientacaoObjeto;

import CalculadoraOrientacaoObjeto.Classes.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Operacao operacao = new Operacao();
        double numero1;
        double numero2;
        int tipo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero1 = teclado.nextDouble();

        System.out.println("Digite o segundo número:");
        numero2 = teclado.nextDouble();

        System.out.println("""
                            Digite o tipo da operação
                            1 - Subtração
                            2 - Soma
                            3 - Divisão
                            4 - Multiplicação
                            """);
        tipo = teclado.nextInt();

        switch (tipo)
        {
            case 1 ->
            {
                operacao = new Subtracao();
            }
            case 2 ->
            {
                operacao = new Soma();
            }
            case 3 ->
            {
                operacao = new Divisao();
            }
            case 4 ->
            {
                operacao = new Multiplicacao();
            }

            default -> System.out.println("Tipo Inválido. " +
                                          "Será retornado os resultados das operações citadas a cima");
        }

        if (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4)
        {
            double resultadoSoma = numero1 + numero2;
            double resultadoSubtracao = numero1 - numero2;
            double resultadoDivisao = numero1 / numero2;
            double resultadoMultiplicacao = numero1 * numero2;

            System.out.println("Resultado da Soma: " + resultadoSoma);
            System.out.println("Resultado da Subtração: " + resultadoSubtracao);
            System.out.println("Resultado da Divisão: " + resultadoDivisao);
            System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
        }
        else
        {
            System.out.println(operacao.calcular(numero1, numero2));
        }
    }
}
