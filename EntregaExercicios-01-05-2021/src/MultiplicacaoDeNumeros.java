import java.util.Scanner;

//Faça um algoritmo para mostrar o resultado da multiplicação de dois números.

public class MultiplicacaoDeNumeros
{
    public static void main(String[] args)
    {
        double num1;
        double num2;
        double resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu primeiro número:");
        num1 = teclado.nextDouble();
        System.out.println("Digite seu segundo número:");
        num2 = teclado.nextDouble();

        resultado = num1 * num2;

        System.out.println("Resultado de sua multiplicação: " + resultado);

        teclado.close();
    }
}
