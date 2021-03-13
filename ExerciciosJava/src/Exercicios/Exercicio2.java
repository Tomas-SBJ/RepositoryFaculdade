package Exercicios;

import java.util.Scanner;

//Fa�a um algoritmo para mostrar o resultado da divis�o de dois n�muros

public class Exercicio2 
{
	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		if(num2 <= 0)
		{
			throw new IllegalArgumentException("Seu segundo n�o pode ser 0.");
		}
		
		resultado = num1 / num2;
		
		System.out.println("Resultado da divis�o: " + resultado);
	}
}
