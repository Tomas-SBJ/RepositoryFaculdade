package Entidades;

public class Desempregado extends BaseEntity
{
    public int MesesDesempregado;

    public Desempregado()
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

    public void setValorBeneficio(double valorBeneficio)
    {
        ValorBeneficio = valorBeneficio;
    }

    public void setMesesDesempregado(int mesesDesempregado)
    {
        MesesDesempregado = mesesDesempregado;
    }

    public void setMesesAuxilio(int mesesAuxilio)
    {
        MesesAuxilio = mesesAuxilio;
    }
}