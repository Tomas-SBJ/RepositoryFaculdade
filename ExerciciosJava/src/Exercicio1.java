import java.util.Scanner;

//Fa�a um algoritmo para mostrar o resultado da multiplica��o de dois n�meros.

public class Exercicio1 
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
		
		resultado = num1 * num2;
		
		System.out.println("Resultado da multiplica��o: " + resultado);
	}
}
