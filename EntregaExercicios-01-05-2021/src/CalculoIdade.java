import java.time.LocalDate;
import java.util.Scanner;

//Faça um algoritmo que leia o ano de nascimento de uma pessoa, calcule e mostre sua idade aproximada.

public class CalculoIdade
{
    public static void main(String[] args)
    {
        int anoNascimento;
        int anoAtual;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digiteu seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();

        if (anoNascimento > 2021)
        {
            throw new IllegalArgumentException("Ano de nascimento inválido.");
        }

        LocalDate data = LocalDate.now();
        anoAtual = data.getYear();

        idade = anoAtual - anoNascimento;

        System.out.println("Sua idade aproximada: " + idade);

        teclado.close();
    }
}
