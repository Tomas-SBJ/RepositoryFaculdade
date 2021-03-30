import java.util.Scanner;

public class Exercicio7
{
    public static void main(String[] args)
    {
        String nome;
        int horasTrabalhadas;
        int dependentes;
        final double valorHora = 32.00;
        final double valorDependente = 40.00;
        double inss;
        double ir;
        double salarioLiquido;
        double salarioBruto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome.");
        nome = teclado.next();
        System.out.println("Digite a quantidade de horas trabalhadas.");
        horasTrabalhadas = teclado.nextInt();
        System.out.println("Digite a quantidade de dependentes");
        dependentes = teclado.nextInt();

        salarioBruto = (horasTrabalhadas * valorHora) + (valorDependente * dependentes);

        inss = salarioBruto * 0.085;
        ir = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - inss - ir;

        System.out.println("Boa tarde " + nome);
        System.out.println("Seu salario bruto é " + salarioBruto);
        System.out.println("Desconto do INSS é " + inss);
        System.out.println("Desconto do IR é " + ir);
        System.out.println("Seu salario Liquido é " + salarioLiquido);
    }
}
