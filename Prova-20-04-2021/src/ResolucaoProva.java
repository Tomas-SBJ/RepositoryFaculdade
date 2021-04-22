import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ResolucaoProva
{
    public static void main(String[] args)
    {
        String nome;
        String dataNascimento;
        String aposentado = null;
        String uf;
        String continuar;
        boolean loop = true;
        int categoria;
        int funcionarios;
        int meses = 12;
        double valorFuncionarios;
        double valorBeneficio;
        double acrescimoPa;
        double acrescimoSp;
        double acrescimoPe;
        double acrescimoFuncionarios;

        List<Beneficiario> beneficiarios = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        while(loop)
        {
            Beneficiario beneficiario = new Beneficiario();

            System.out.println("Digite seu nome completo:");
            nome = teclado.nextLine();

            System.out.println("Digite sua data de nascimento:");
            dataNascimento = teclado.next();

            System.out.println("Digite seu UF:");
            uf = teclado.next();

            System.out.println("Digite o valor do seu auxilio:");
            valorBeneficio = teclado.nextDouble();

            acrescimoPa = BeneficioPa(uf, valorBeneficio);
            acrescimoSp = BeneficioSp(uf, valorBeneficio);
            acrescimoPe = BeneficioPe(uf, valorBeneficio);

            System.out.println("""
                    Escolha uma categoria:
                    Categoria 1 - Empregado
                    Categoria 2 - Empregador
                    Categoria 3 - Desempregado
                    """);
            categoria = teclado.nextInt();

            switch (categoria)
            {
                case 1 ->
                {
                    if (valorBeneficio >= 1000 && valorBeneficio <= 1800)
                    {
                        System.out.println("Digite uma das opções caso você seja aposentado (Sim ou Não):");
                        aposentado = teclado.next();

                        if (!aposentado.equals("Sim") && !aposentado.equals("Não"))
                        {
                            throw new IllegalArgumentException("Opção inválida. (Por gentileza, digite Sim ou Não para a pergunta de aposentado");
                        }
                    }
                    else
                    {
                        throw new IllegalArgumentException("Valor inválido");
                    }
                }

                case 2 ->
                {
                    System.out.println("Quantidade de funcionarios:");
                    funcionarios = teclado.nextInt();

                    acrescimoFuncionarios = BeneficioEmpregadores(funcionarios, valorBeneficio);
                    meses = ValidarEmpregador(categoria, meses);
                    valorFuncionarios = funcionarios * 200;
                }

                case 3 ->
                {
                    if (valorBeneficio >= 1500 && valorBeneficio <= 2300)
                    {
                        System.out.println("Quantos meses desempregados:");
                        meses = teclado.nextInt();
                    }
                    else
                    {
                        throw new IllegalArgumentException("Valor inválido");
                    }
                }

                default -> throw new IllegalArgumentException("Categoria " + categoria + " inválida");
            }

            beneficiario.setNome(nome);
            //beneficiario.setDataNascimento(dataNascimento);
            beneficiario.setUf(uf);
            beneficiario.setAposentado(aposentado);
            beneficiario.setCategoria(categoria);
            beneficiario.setValorBeneficio(valorBeneficio);

            beneficiarios.add(beneficiario);

            System.out.println("Deseja adicionar um novo beneficiário ? (Sim ou Não)");
            continuar = teclado.next();

            if (continuar.equals("Não"))
            {
                loop = false;
            }
        }

        System.out.println(beneficiarios);
    }

    public static double BeneficioPa(String uf, double beneficioPa)
    {
        if (uf.equals("PA"))
        {
            beneficioPa *= 0.09;
        }
        else
        {
            beneficioPa = 0;
        }

        return beneficioPa;
    }

    public static double BeneficioSp(String uf, double beneficioSp)
    {
        if (uf.equals("SP"))
        {
            beneficioSp *= 0.1;
        }
        else
        {
            beneficioSp = 0;
        }

        return beneficioSp;
    }

    public static double BeneficioPe(String uf, double beneficioPe)
    {
        if (uf.equals("PE"))
        {
            beneficioPe *= 0.14;
        }
        else
        {
            beneficioPe = 0;
        }

        return beneficioPe;
    }

    public static double BeneficioEmpregadores(int funcionarios, double beneficioEmpregadores)
    {
        if (funcionarios <= 50)
        {
            beneficioEmpregadores *= 0.1;
        }
        else
        {
            beneficioEmpregadores = 0;
        }

        return beneficioEmpregadores;
    }

    public static int ValidarEmpregador(int categoria, int meses)
    {
        if (categoria == 2)
        {
            meses = 7;
        }

        return meses;
    }

    public static void ValidarIdade(Calendar dataNascimento)
    {
    }
}
