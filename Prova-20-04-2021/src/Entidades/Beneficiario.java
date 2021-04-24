package Entidades;

import java.util.List;

public class Beneficiario
{
    protected List<Desempregado> Desempregado;
    protected List<Empregador> Empregador;
    protected List<Empregado> Empregado;

    public Beneficiario()
    {
    }

    public void setDesempregado(List<Desempregado> desempregado)
    {
        Desempregado = desempregado;
    }

    public void setEmpregador(List<Empregador> empregador)
    {
        Empregador = empregador;
    }

    public void setEmpregado(List<Empregado> empregado)
    {
        Empregado = empregado;
    }
}
