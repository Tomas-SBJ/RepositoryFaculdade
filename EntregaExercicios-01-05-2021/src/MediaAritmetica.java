import java.util.Scanner;

/*
    Faça um algoritmo para calcular a média aritmética entre 4 notas de um aluno.
    Verificar o sexo do aluno(a).
    Verificar se foi aprovado ou não. (Média 70)
 */

public class MediaAritmetica
{
    public static void main(String[] args)
    {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        String sexo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu sexo (M ou F):");
        sexo = teclado.next();

        if (!sexo.equals("M") && !sexo.equals("F"))
        {
            throw new IllegalArgumentException("Sexo inválido.");
        }

        System.out.println("Informe sua primeira nota (0 à 100):");
        nota1 = teclado.nextDouble();

        if (nota1 > 100 || nota1 < 0)
        {
            throw new IllegalArgumentException("Primeira nota inválida.");
        }

        System.out.println("Informe sua segunda nota (0 à 100):");
        nota2 = teclado.nextDouble();

        if (nota2 > 100 || nota2 < 0)
        {
            throw new IllegalArgumentException("Segunda nota inválida.");
        }

        System.out.println("Informe sua terceira nota (0 à 100):");
        nota3 = teclado.nextDouble();

        if (nota3 > 100 || nota3 < 0)
        {
            throw new IllegalArgumentException("Terceira nota inválida.");
        }

        System.out.println("Informe sua quarta nota (0 à 100):");
        nota4 = teclado.nextDouble();

        if (nota4 > 100 || nota4 < 0)
        {
            throw new IllegalArgumentException("Quarta nota inválida.");
        }

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (sexo.equals("M"))
        {
            if (media >= 70)
            {
                System.out.println("Caro aluno, você foi aprovado. Média: " + media);
            }
            else
            {
                System.out.println("Caro aluno, você foi reprovado. Média: " + media);
            }
        }
        else
        {
            if (media >= 70)
            {
                System.out.println("Cara aluna, você foi aprovada. Média: " + media);
            }
            else
            {
                System.out.println("Cara aluna, você foi reprovada. Média: " + media);
            }
        }

        teclado.close();
    }
}
