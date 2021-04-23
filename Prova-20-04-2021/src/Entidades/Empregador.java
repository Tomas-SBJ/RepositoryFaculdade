package Entidades;

public class Empregador extends BaseEntity
{
    public int QuantidadeFuncionarios;

    public Empregador()
    {
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public void setAnoNascimento(int anoNascimento)
    {
        AnoNascimento = anoNascimento;
    }

    public void setUf(String uf)
    {
        UF = uf;
    }

    public void setCategoria(int categoria)
    {
        Categoria = categoria;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios)
    {
        QuantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setValorBeneficio(double valorBeneficio)
    {
        ValorBeneficio = valorBeneficio;
    }

    public void setMesesAuxilio(int mesesAuxilio)
    {
        MesesAuxilio = mesesAuxilio;
    }
}
