import java.util.Scanner;

public class Fila
{
    public static void main(String[] args)
    {
        String nome[] = new String[20];
        String descricao[] = new String[20];
        int idade[] = new int[20];
        int opcao;
        int contador = 0;
        int atender;
        boolean loop = true;

        Scanner teclado = new Scanner(System.in);

        while (loop)
        {
            System.out.println("""
            Escolha uma opção.
            1 - Incluir Paciente.
            2 - Atender Paciente.
            3 - Sair.
            """);

            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 1 ->
                {
                    if (nome[19] != null)
                    {
                        System.out.println("\nJa existe 20 Pacientes na fila.");
                    } else
                    {
                        if ((nome[19] == null) && (nome[18] != null)) {

                            System.out.println("Digite o Nome do " + (19 + 1) + "º Paciente");
                            nome[19] = teclado.next();

                            System.out.println("Digite a Idade do " + (19 + 1) + "º Paciente");
                            idade[19] = teclado.nextInt();

                            System.out.println("Digite a Descrição do " + (19 + 1) + "º Paciente");
                            descricao[19] = teclado.next();
                            contador++;
                        }
                        else
                        {

                            System.out.println("Digite o Nome do " + (contador + 1) + "º Paciente");
                            nome[contador] = teclado.next();

                            System.out.println("Digite a Idade do " + (contador + 1) + "º Paciente");
                            idade[contador] = teclado.nextInt();

                            System.out.println("Digite a Descrição do " + (contador + 1) + "º Paciente");
                            descricao[contador] = teclado.next();

                            contador++;
                        }
                    }
                }
                case 2 ->
                {
                    System.out.println("Digite o Numero do Paciente que deseja atender");
                    atender = teclado.nextInt();

                    if(nome[atender] == null)
                    {
                        System.out.println("Não existe um paciente de Numero " + atender);
                    }
                    else
                    {
                        System.out.println("O paciente " + nome[atender] + " foi atendido.");

                        int j = atender + 1;

                        for (; atender < 19; atender++)
                        {
                            nome[atender] = nome[j];
                            idade[atender] = idade[j];
                            descricao[atender] = descricao[j];

                            j++;
                        }

                        nome[19] = null;
                        idade[19] = 0;
                        descricao[19] = null;

                        contador--;
                    }
                }
                case 3 -> loop = false;
            }
        }

        for (int i = 0; i < 20; i++)
        {
            System.out.println("O paciente " + nome[i] + " tem " + idade[i] + " e sua descrição é " + descricao[i]);
        }
    }
}
