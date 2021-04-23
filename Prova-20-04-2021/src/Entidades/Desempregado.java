package Entidades;

public class Desempregado extends BaseEntity
{
    public int MesesDesempregado;

    public Desempregado()
    {
    }

    public Desempregado(String nome, int anoNascimento, String uf, int categoria,
                        double valorBeneficio, int mesesDesempregado, int mesesAuxilio)
    {
        Nome = nome;
        AnoNascimento = anoNascimento;
        UF = uf;
        Categoria = categoria;
        ValorBeneficio = valorBeneficio;
        MesesDesempregado = mesesDesempregado;
        MesesAuxilio = mesesAuxilio;
    }

    public void setMesesDesempregado(int mesesDesempregado)
    {
        MesesDesempregado = mesesDesempregado;
    }

    public int getMesesDesempregado()
    {
        return MesesDesempregado;
    }
}

