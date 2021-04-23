package Entidades;

public class Empregador extends BaseEntity
{
    public int QuantidadeFuncionarios;

    public Empregador()
    {
    }

    public Empregador(String nome, int anoNascimento, String uf, int categoria,
                        double valorBeneficio, int quantidadeFuncionarios, int mesesAuxilio)
    {
        Nome = nome;
        AnoNascimento = anoNascimento;
        UF = uf;
        Categoria = categoria;
        ValorBeneficio = valorBeneficio;
        MesesAuxilio = mesesAuxilio;
        QuantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios()
    {
        return QuantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios)
    {
        QuantidadeFuncionarios = quantidadeFuncionarios;
    }
}
