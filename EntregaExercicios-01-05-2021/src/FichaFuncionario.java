import java.util.Scanner;

/*
    Faça um algoritmo que leia os dados da ficha do funcionário, calcule:
    1- O salário bruto (hora * valorhora + dependente * valordependente)
    2- Valor do desconto de INSS (percentual sobre o salario bruto);
    3- Valor de desconto de IR (percentual sobre o salario bruto);
    4- Valor liquido do salário deste funcionário (Salario Bruto - INSS - IR).
 */

public class FichaFuncionario
{
    public static void main(String[] args)
    {
        String nome;
        double horasTrabalhadas;
        int dependetes;
        final double valorHora = 32.00;
        final double valorDependente = 40.00;
        double inss;
        double ir;
        double salarioLiquido;
        double salarioBruto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = teclado.next();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        horasTrabalhadas = teclado.nextDouble();
        System.out.println("Digite a quantidade de dependentes:");
        dependetes = teclado.nextInt();

        salarioBruto = (horasTrabalhadas * valorHora) + (valorDependente * dependetes);
        inss = salarioBruto * 0.085;
        ir = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - inss - ir;

        System.out.println("Boa tarde " + nome);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Desconto do INSS: " + inss);
        System.out.println("Desconto do IR: " + ir);
        System.out.println("Salario liquido: " + salarioLiquido);

        teclado.close();
    }
}
