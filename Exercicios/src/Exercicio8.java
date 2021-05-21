import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        double salario = 545.00;
        double salarioFinal = 0;
        double acrescimo = 0;
        double[] valorUnitario = new double[10];
        double somaValorTotalVendas = 0;
        double precoProduto = 0;
        int i;
        int[] quantidadeVendida = new int[10];
        int somaQuantidadesVendas = 0;
        int maior = 0;
        int posicaoVetor = 0;

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < 10; i++)
        {
            System.out.println("Digite a quantidade de produtos que foram vendidos:");
            quantidadeVendida[i] = teclado.nextInt();

            System.out.println("Digite o valor unitario de cada produto:");
            valorUnitario[i] = teclado.nextDouble();
        }
        for(i = 0; i < 10; i++)
        {
            somaQuantidadesVendas += quantidadeVendida[i];
            somaValorTotalVendas += valorUnitario[i];

            if (quantidadeVendida[i] > maior)
            {
                maior = quantidadeVendida[i];
                precoProduto = valorUnitario[i];
                posicaoVetor = i;
            }
        }
        acrescimo = somaValorTotalVendas * 0.05;
        salarioFinal = salario + acrescimo;

        System.out.println("Quantida vendida: " + somaQuantidadesVendas);
        System.out.println("Valor Unitário: " + somaValorTotalVendas);
        System.out.println("O produto mais vendido tem o preço de R$" + precoProduto +
                            " e está na posição " + posicaoVetor);
        System.out.println("Salário será de R$" + salarioFinal);
    }
}
