package Exercicios;

import java.util.Scanner;

//Fa�a um algoritmo para calcular a m�dia aritm�tica entre quatro notas de um aluno.
//Vericar sexo do aluno para retornar a mensagem dependendo do seu sexo.
//Este mesmo algoritmo deve mostrar a situa��o desse aluno, que pode ser aprovado ou reprovado.
//M�dia de aprova��o � 70

public class Exercicio3 
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		int num4;
		double media;
		String sexo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu sexo (M ou F): ");
		sexo = teclado.next();
		
		if(!sexo.equals("M") && !sexo.equals("F"))
		{
			throw new IllegalArgumentException("Sexo Invalido!");
		}
		
		System.out.println("Digite sua primeira nota de 1 a 100: ");
		num1 = teclado.nextInt();
		System.out.println("Digite sua segunda nota de 1 a 100: ");
		num2 = teclado.nextInt();
		System.out.println("Digite sua terceira nota de 1 a 100: ");
		num3 = teclado.nextInt();
		System.out.println("Digite sua quarta nota de 1 a 100: ");
		num4 = teclado.nextInt();
		
		media = (num1 + num2 + num3 + num4) / 4;
		
		if(sexo.equals("M"))	
		{
			if(media >= 70)
			{
				System.out.println("Caro aluno, voc� foi aprovado. M�dia: " + media);
			}
			else
			{
				System.out.println("Caro aluno, voc� foi reprovado. M�dia: " + media);
			}
		}
		else
		{
			if(media >= 70)
			{
				System.out.println("Cara aluna, voc� foi aprovada, M�dia: " + media);
			}
			else
			{
				System.out.println("Cara aluna, voc� foi reprovada, M�dia: " + media);
			}
		}
	}
}