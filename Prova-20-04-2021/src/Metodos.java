import java.time.LocalDate;

public class Metodos
{
    protected Metodos()
    {
    }

    public static double beneficioEstados(String uf, double acrescimo)
    {
        switch (uf)
        {
            case "PA" ->
                    {
                        acrescimo *= 0.09;
                        return acrescimo;
                    }
            case "SP" ->
                    {
                        acrescimo *= 0.1;
                        return acrescimo;
                    }
            case "PE" ->
                    {
                        acrescimo *= 0.14;
                        return acrescimo;
                    }
        }

        acrescimo = 0;
        return acrescimo;
    }

    public static double beneficioEmpregadores(int quantidadeFuncionarios, double valorFuncionarios)
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

    public static int mesesEmpregador(int categoria)
    {
        int mesesAuxilio = 0;

        if (categoria == 2)
        {
            mesesAuxilio = 7;
        }

        return mesesAuxilio;
    }

    public static void validarBeneficioInicial(int categoria, double beneficioInicial)
    {
        if (categoria == 1)
        {
            if (beneficioInicial < 1000.00 || beneficioInicial > 1800)
            {
                throw new IllegalArgumentException("Valor inválido. (1000.00 - 1800.00)");
            }
        }
        else if (categoria == 3)
        {
            if (beneficioInicial < 1500.00 || beneficioInicial > 2300)
            {
                throw new IllegalArgumentException("Valor inválido. (1500.00 - 2300.00)");
            }
        }
    }

    public static String validarIdade(int dataNascimento)
    {
        String maiorIdade = "é maior de idade";

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - dataNascimento;

        if (idade < 18)
        {
            throw new IllegalArgumentException("Benefício inválido para esta idade.");
        }

        return maiorIdade;
    }

    public static void validarMes(int mesesAuxilio)
    {
        if (mesesAuxilio < 2 || mesesAuxilio > 12)
        {
            throw new IllegalArgumentException("Meses inválido");
        }
    }

    public static void validarAposentado(String aposentado)
    {
        if (!aposentado.equals("Sim") && !aposentado.equals("Não"))
        {
            throw new IllegalArgumentException("Por gentileza, digite 'Sim' ou 'Não' para está pergunta");
        }
    }

    public static void validarUF(String uf)
    {
        if (uf.length() != 2)
        {
            throw new IllegalArgumentException("UF inválido.");
        }
    }

    public static String converterCategoria(int categoriaInt)
    {
        String categoria;

        if (categoriaInt == 1)
        {
            categoria = "Empregado";
            return categoria;
        }
        else if(categoriaInt == 2)
        {
            categoria = "Empregador";
            return categoria;
        }
        else
        {
            categoria = "Desempregado";
            return categoria;
        }
    }
}
