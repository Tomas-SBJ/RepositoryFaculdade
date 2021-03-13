package Exercicios;

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
		
		System.out.println("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		if(num2 <= 0)
		{
			throw new IllegalArgumentException("Seu segundo não pode ser 0.");
		}
		
		resultado = num1 / num2;
		
		System.out.println("Resultado da divisão: " + resultado);
	}
}
