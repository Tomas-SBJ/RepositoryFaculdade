import java.util.Scanner;

/*
    Faça um algoritmo que leia um determinado valor real, calcule e mostre este valor acrescido de 15,8%
    Observação 1: Acrescido = Valor + (Valor * (15.8/100));
    Observação 2: Caso de teste 1486,45 deve gerar como resultado 1721,3091.
    Observação 3: Necessário pesquisar como tratar um float utilizando vírgula.
 */

public class CalculoValorAcrescido
{
    public static void main(String[] args)
    {
        double valor;
        double valorNovo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor:");
        valor = teclado.nextDouble();

        valorNovo = (valor + (valor * 0.158));

        System.out.println("Valor novo: " + valorNovo);

        teclado.close();
    }
}
