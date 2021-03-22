import java.util.Scanner;

//Faça um algoritmo para mostrar o resultado da multiplicação de dois números.

public class Exercicio1 
{
	public static void main(String[] args)
	{
		double num1;
		double num2;
		double resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		resultado = num1 * num2;
		
		System.out.println("Resultado da multiplicação: " + resultado);
	}
}
