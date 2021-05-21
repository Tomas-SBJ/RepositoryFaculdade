import java.util.Scanner;

public class Exercicio9
{
    public static void main(String[] args)
    {
        String[] nome = new String[20];
        String[] descricao = new String[20];
        int[] idade = new int[20];

        int i = 0;
        int opcao;



        Scanner scanner = new Scanner(System.in);



         while(true)
        {
            System.out.println("""
                     Escolha uma opção:
                     1 - Incluir paciente;
                     2 - Atender paciente;
                     3 - Sair.        
                     """);
            opcao = scanner.nextInt();

            switch (opcao)
            {
                case 1 ->
                {
                    System.out.println("Digite o nome do paciente:");
                    nome[i] = scanner.next();

                    System.out.println("Digite a idade do paciente:");
                    idade[i] = scanner.nextInt();

                    System.out.println("Digite a descrição para o cliente:");
                    descricao[i] = scanner.next();

                    if(nome[i] == null || descricao[i] == null || idade[i] <= 0)
                    {
                        throw new IllegalArgumentException("Todos os campos são obrigatórios.");
                    }

                    System.out.println("Paciente cadastrado com sucesso.");
                }

                case 2 ->
                {
                    System.out.println("Paciente cadastrado com sucesso.");
                }

                case 3 ->
                {

                }

                default -> throw new IllegalArgumentException("Opção inválida.");
            }
        }
    }
}
