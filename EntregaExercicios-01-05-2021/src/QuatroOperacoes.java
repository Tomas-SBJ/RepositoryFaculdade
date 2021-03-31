import java.util.Scanner;

//Faça um algoritmo que leia dois números inteiros, execute e mostre as quatro operações aritméticas básicas.

public class QuatroOperacoes
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int resultadoSoma;
        int resultadoSubtracao;
        int resultadoMultiplicacao;
        double resultadoDivisao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu primeiro número:");
        num1 = teclado.nextInt();
        System.out.println("Digite seu segundo número:");
        num2 = teclado.nextInt();

        resultadoSoma = num1 + num2;
        resultadoSubtracao = num1 - num2;
        resultadoMultiplicacao = num1 * num2;

        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        if (num2 == 0)
        {
            System.out.println("Número 0 inválido para divisão");
        }
        else
        {
            resultadoDivisao = (double) num1 / num2;
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        }

        teclado.close();
    }
}
