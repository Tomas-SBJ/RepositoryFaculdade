import java.util.Scanner;

//Faça um algoritmo para mostrar o resultado da divisão de dois números.

public class DivisaoDeNumeros
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

        if (num2 == 0)
        {
            throw new IllegalArgumentException("Seu segundo não pode ser 0.");
        }

        resultado = num1 / num2;

        System.out.println("Resultado da sua divisão: " + resultado);

        teclado.close();
    }
}
