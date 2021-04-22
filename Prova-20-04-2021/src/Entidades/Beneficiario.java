package Entidades;

public class Beneficiario
{
    public Desempregado Desempregado;
    public Empregador Empregador;
    public Empregado Empregado;

    public Beneficiario()
    {
    }

    public void setDesempregado(Desempregado desempregado)
    {
        Desempregado = desempregado;
    }

    public void setEmpregador(Empregador empregador)
    {
        Empregador = empregador;
    }

    public void setEmpregado(Empregado empregado)
    {
        Empregado = empregado;
    }
}
