import java.util.Scanner;

/*
Escreva um programa que receba o salário inicial de um funcionário, calcule e mostre o novo salário
acrescido de bonificação e de auxílio escola, com base nas tabelas a seguir
 */
public class Exercicio4
{
    public static void main(String[] args)
    {
        double salarioInicial;
        double salarioFinal;
        double bonificacao = 0;
        double auxilio;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário.");
        salarioInicial = teclado.nextDouble();

        if(salarioInicial <= 800)
        {
            bonificacao = salarioInicial * 0.05;
            System.out.println("Você tem 5% de BONIFICAÇÃO.");
        }
        else if(salarioInicial > 800 && salarioInicial <= 1300)
        {
            bonificacao = salarioInicial * 0.12;
            System.out.println("Você tem 12% de BONIFICAÇÂO.");

        }
        else
        {
            System.out.println("Você não tem acesso a BONIFICAÇÂO.");
        }

        if(salarioInicial <= 900)
        {
            auxilio = 150;
            System.out.println("Você tem acesso a R$150,00 de auxílio escola.");
        }
        else
        {
            auxilio = 100;
            System.out.println("Você tem acesso a R$100,00 de auxílio escola.");
        }

        salarioFinal = salarioInicial + bonificacao + auxilio;

        System.out.println("Seu salario com seus beneficios: " + salarioFinal);
    }
}
