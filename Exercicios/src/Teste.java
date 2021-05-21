import java.util.Scanner;

public class Teste
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int entrada;
        double resultado;
        boolean impar;
        int i = 1;

        System.out.println("Digite o número de entrada. (Maior ou igual à 10)");
        entrada = teclado.nextInt();

        resultado = entrada;

        if (entrada < 10)
        {
            resultado = 0;
        }
        else
        {
            while(i < entrada)
            {
                impar = VerificarImpar(i);

                if (impar)
                {
                    resultado *= i;
                }

                i++;
            }
        }

        System.out.println("Produto dos números impares: " + resultado);
    }

    public static boolean VerificarImpar(int i)
    {
        if (i % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
