package Exercicios;

import java.util.Scanner;

//Fa�a um algoritmo para calcular a m�dia aritm�tica entre tr�s notas de um aluno.
//Este mesmo algoritmo deve mostrar a situa��o desse aluno, que pode ser aprovado ou reprovado.
//M�dia de aprova��o � 7

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
			System.out.println("Voc� foi aprovado, M�dia: " + media);
		}
		else if(media < 7)
		{
			System.out.println("Voc� foi reprovado, M�dia: " + media);
		}
	}
}
