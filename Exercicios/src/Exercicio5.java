import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo, A, B e C são reais.
Escreva os números A, B, C obedecendo à tabela a seguir. Suponha que o valor digitado para I seja sempre um valor
Válido, ou seja, 1, 2 ou 3, e que os números digitados sejam diferentes um do outro.
 */
public class Exercicio5
{
    public static void main(String[] args)
    {
        int opcao;
        int contador = 1;
        double[] numeros = new double[3];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número para I referente a opção:");
        System.out.println("1 - A, B e C em ordem crescente.");
        System.out.println("2 - A, B e C em ordem decrescente.");
        System.out.println("3 - O maior fica entre os dois números.");
        opcao = teclado.nextInt();

        if (opcao != 1 && opcao != 2 && opcao != 3)
        {
            throw new IllegalArgumentException("Opção não existe.");
        }
        
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println("Digite seu " + contador + "° número.");
            numeros[i] = teclado.nextDouble();
            contador++;
        }

        if (opcao == 1)
        {
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
        }
        else if (opcao == 2)
        {
            Arrays.sort(numeros);
            System.out.println(numeros[2]);
            System.out.println(numeros[1]);
            System.out.println(numeros[0]);
        }
        else
        {
            Arrays.sort(numeros);
            System.out.println(numeros[1]);
            System.out.println(numeros[2]);
            System.out.println(numeros[0]);
        }
    }
}
