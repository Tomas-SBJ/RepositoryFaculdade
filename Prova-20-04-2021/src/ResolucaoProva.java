import Entidades.Beneficiario;
import Entidades.Desempregado;
import Entidades.Empregado;
import Entidades.Empregador;

import java.time.LocalDate;
import java.util.*;

public class ResolucaoProva
{
    public static void main(String[] args)
    {
        boolean loop = true;

        int categoria;
        int mesesDesempregado;
        int quantidadeFuncionarios;
        int mesesAuxilio;
        int dataNascimento;

        String continuar;
        String nome;
        String uf;
        String aposentado;

        double beneficioInicial = 0;
        double beneficioFinal;
        double valorBeneficioFuncionarios = 0;
        double acrescimoPa;
        double acrescimoSp;
        double acrescimoPe;

        Scanner teclado = new Scanner(System.in);

        List<Beneficiario> beneficiarios = new ArrayList();
        Beneficiario beneficiario = new Beneficiario();

        while(loop)
        {
            Empregado empregado = new Empregado();
            Empregador empregador = new Empregador();
            Desempregado desempregado = new Desempregado();

            System.out.println("Digite seu nome completo.");
            nome = teclado.nextLine();

            System.out.println("Digite seu ano de nascimento. Ex: 2003");
            dataNascimento = teclado.nextInt();

            ValidarIdade(dataNascimento);

            System.out.println("Digite seu UF. (Ex: SC)");
            uf = teclado.next();

            System.out.println("Digite a quantidade de meses que vai receber o auxilio");
            mesesAuxilio = teclado.nextInt();

            ValidarMes(mesesAuxilio);

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
                    System.out.println("Digite o valor do auxilio.");
                    beneficioInicial = teclado.nextDouble();

                    if (beneficioInicial >= 1000.00 && beneficioInicial <= 1800)
                    {
                        System.out.println("Empregado aposentado ? (Sim - Não)");
                        aposentado = teclado.next();

                        ValidarAposentado(aposentado);
                    }
                    else
                    {
                        throw new IllegalArgumentException("Valor inválido. (1000.00 - 1800.00)");
                    }

                    empregado.setAposentado(aposentado);
                }

                case 2 ->
                {
                    System.out.println("Digite a quantidade de funcionarios.");
                    quantidadeFuncionarios = teclado.nextInt();

                    beneficioInicial = quantidadeFuncionarios * 200;
                    valorBeneficioFuncionarios = BeneficioEmpregadores(quantidadeFuncionarios, beneficioInicial);

                    mesesAuxilio = MesesEmpregador(categoria, mesesAuxilio);

                    empregador.setQuantidadeFuncionarios(quantidadeFuncionarios);
                }

                case 3 ->
                {
                    System.out.println("Digite o valor do auxilio.");
                    beneficioInicial = teclado.nextDouble();

                    if (beneficioInicial >= 1500.00 && beneficioInicial <= 2300)
                    {
                        System.out.println("Digite a quantidade de meses desempregado.");
                        mesesDesempregado = teclado.nextInt();
                    }
                    else
                    {
                        throw new IllegalArgumentException("Valor inválido. (1500.00 - 2300.00)");
                    }

                    desempregado.setMesesDesempregado(mesesDesempregado);
                }

                default -> throw new IllegalArgumentException("Categoria inválida.");
            }

            acrescimoPa = BeneficioPa(uf, beneficioInicial);
            acrescimoSp = BeneficioSp(uf, beneficioInicial);
            acrescimoPe = BeneficioPe(uf, beneficioInicial);

            if (categoria != 2)
            {
                beneficioFinal = beneficioInicial + acrescimoPa + acrescimoSp + acrescimoPe;

                if (categoria == 1)
                {
                    empregado.setCategoria(categoria);
                    empregado.setNome(nome);
                    empregado.setAnoNascimento(dataNascimento);
                    empregado.setUf(uf);
                    empregado.setValorBeneficio(beneficioFinal);
                    empregado.setMesesAuxilio(mesesAuxilio);
                }
                else
                {
                    desempregado.setCategoria(categoria);
                    desempregado.setNome(nome);
                    desempregado.setAnoNascimento(dataNascimento);
                    desempregado.setUf(uf);
                    desempregado.setValorBeneficio(beneficioFinal);
                    desempregado.setMesesAuxilio(mesesAuxilio);
                }
            }
            else
            {
                beneficioFinal = beneficioInicial + valorBeneficioFuncionarios + acrescimoPa + acrescimoSp + acrescimoPe;

                empregador.setCategoria(categoria);
                empregador.setNome(nome);
                empregador.setAnoNascimento(dataNascimento);
                empregador.setUf(uf);
                empregador.setValorBeneficio(beneficioFinal);
                empregador.setMesesAuxilio(mesesAuxilio);
            }

            beneficiario.setEmpregado(empregado);
            beneficiario.setDesempregado(desempregado);
            beneficiario.setEmpregador(empregador);

            System.out.println("Deseja adicionar um novo beneficiário ? (Sim - Não)");
            continuar = teclado.next();

            if (continuar.equals("Não"))
            {
                loop = false;
            }
        }
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

    public static double BeneficioEmpregadores(int quantidadeFuncionarios, double valorFuncionarios)
    {
        if (quantidadeFuncionarios <= 50)
        {
            valorFuncionarios *= 0.1;
        }
        else
        {
            valorFuncionarios = 0;
        }

        return valorFuncionarios;
    }

    public static int MesesEmpregador(int categoria, int mesesAuxilio)
    {
        if (categoria == 2)
        {
            mesesAuxilio = 7;
        }

        return mesesAuxilio;
    }

    public static void ValidarIdade(int dataNascimento)
    {
        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - dataNascimento;

        if (idade < 18)
        {
            throw new IllegalArgumentException("Benefício inválido para esta idade.");
        }
    }

    public static void ValidarMes(int mesesAuxilio)
    {
        if (mesesAuxilio < 2 || mesesAuxilio > 12)
        {
            throw new IllegalArgumentException("Meses inválido");
        }
    }

    public static void ValidarAposentado(String aposentado)
    {
        if (!aposentado.equals("Sim") && !aposentado.equals("Não"))
        {
            throw new IllegalArgumentException("Por gentileza, digite 'Sim' ou 'Não' para está pergunta");
        }
    }
}
