import java.util.Scanner;

//Faça um algoritmo para mostrar o resultado da divisão de dois númuros
public class Exercicio2
{
    public static void main(String[] args)
    {
        double num1;
        double num2;
        double resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Digite seu primeiro número: ");
        num2 = teclado.nextDouble();

        if (num2 == 0)
        {
            throw new IllegalArgumentException("Seu segundo número não pode ser 0.");
        }

        resultado = num1 / num2;

        System.out.println("Resultado de sua divisão é: " + resultado);
    }
}
