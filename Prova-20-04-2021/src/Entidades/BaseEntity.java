package Entidades;

public class BaseEntity
{
    public String Nome;
    public int AnoNascimento;
    public String UF;
    public int Categoria;
    public double ValorBeneficio;
    public int MesesAuxilio;

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

    public void setValorBeneficio(double valorBeneficio)
    {
        ValorBeneficio = valorBeneficio;
    }

    public void setMesesAuxilio(int mesesAuxilio)
    {
        MesesAuxilio = mesesAuxilio;
    }
}
