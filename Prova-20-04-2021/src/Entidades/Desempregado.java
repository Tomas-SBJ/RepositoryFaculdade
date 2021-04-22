package Entidades;

import Entidades.BaseEntity;

import java.util.Calendar;

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

    public void setDataNascimento(Calendar dataNascimento)
    {
        DataNascimento = dataNascimento;
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