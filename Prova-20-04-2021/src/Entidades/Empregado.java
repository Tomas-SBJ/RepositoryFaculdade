package Entidades;

public class Empregado extends BaseEntity
{
    public String Aposentado;

    public Empregado()
    {
    }

    public Empregado(String nome, int anoNascimento, String uf, int categoria,
                     double valorBeneficio, int mesesAuxilio, String aposentado)
    {
        Nome = nome;
        AnoNascimento = anoNascimento;
        UF = uf;
        Categoria = categoria;
        ValorBeneficio = valorBeneficio;
        MesesAuxilio = mesesAuxilio;
        Aposentado = aposentado;
    }

    public void setAposentado(String aposentado)
    {
        Aposentado = aposentado;
    }
}
