import java.util.Scanner;

public class Pilha
{
    public static void main(String[] args)
    {
        int[] caixa = new int[20];
        int opcao;
        int contador = 0;
        int quantidade;
        boolean loop = true;

        Scanner teclado = new Scanner(System.in);

        while (loop)
        {
            System.out.println("""
            Escolha uma opção.
            1 - Incluir Caixa.
            2 - Retirar Caixa.
            3 - Sair.
            """);
            opcao = teclado.nextInt();

            if (opcao != 1 && opcao != 2 && opcao != 3)
            {
                throw new IllegalArgumentException("Opção Invalida.");
            }

            switch (opcao)
            {
                case 1 ->
                        {
                            System.out.println("Digite a quantidade de caixas a serem adicionadas.");
                            quantidade = teclado.nextInt();

                            for (int i = 0; i < quantidade; i++)
                            {
                                caixa[contador] = caixa[i] + 1;

                                contador++;
                            }
                        }
                case 2 ->
                        {
                            System.out.println("Digite a quantidade de caixas a serem retiradas.");
                            quantidade = teclado.nextInt();

                            for (int i = 0; i < quantidade; i++)
                            {
                                caixa[contador] = caixa[i] - 1;

                                contador--;
                            }
                        }
                case 3 -> loop = false;
            }
        }

        for (int i = 0; i < 20; i++)
        {
            System.out.println("Posição com " + caixa[i] + " caixas.");
        }
    }
}
