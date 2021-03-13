package Exercicios;

import java.util.Scanner;

//Faça um algoritmo para calcular a média aritmética entre três notas de um aluno.
//Este mesmo algoritmo deve mostrar a situação desse aluno, que pode ser aprovado ou reprovado.
//Média de aprovação é 7

public class Exercicio3 
{
	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double num3;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		num1 = teclado.nextInt();
		System.out.println("Digite sua segunda nota: ");
		num2 = teclado.nextInt();
		System.out.println("Digite sua terceira nota: ");
		num3 = teclado.nextInt();
		
		media = (num1 + num2 + num3) / 3;
		
		if(media >= 7)
		{
			System.out.println("Você foi aprovado, Média: " + media);
		}
		else if(media < 7)
		{
			System.out.println("Você foi reprovado, Média: " + media);
		}
	}
}
