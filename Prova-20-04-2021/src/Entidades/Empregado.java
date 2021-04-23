package Entidades;

public class Empregado extends BaseEntity
{
    public String Aposentado;

    public Empregado()
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

    public void setAposentado(String aposentado)
    {
        Aposentado = aposentado;
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
