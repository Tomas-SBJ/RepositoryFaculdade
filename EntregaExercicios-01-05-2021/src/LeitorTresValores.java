import java.util.Scanner;

//Faça um algoritmo que leia três valores inteiros e mostre no console.

public class LeitorTresValores
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int num3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu primeiro número:");
        num1 = teclado.nextInt();
        System.out.println("Digite seu primeiro número:");
        num2 = teclado.nextInt();
        System.out.println("Digite seu primeiro número:");
        num3 = teclado.nextInt();

        System.out.println("Resultado da operação (V1 + V2): " + (num1 + num2));
        System.out.println("Resultado da operação (V2 - V1): " + (num2 - num1));
        System.out.println("Resultado da operação (V3 * V1): " + (num3 * num1));
        System.out.println("Resultado da operação (V3 + V2): " + (num3 + num2));
        System.out.println("Resultado da operação (V3 - V2): " + (num3 - num2));
        System.out.println("Resultado da operação (V1 + V2 + V3): " + (num1 + num2 + num3));

        teclado.close();
    }
}
