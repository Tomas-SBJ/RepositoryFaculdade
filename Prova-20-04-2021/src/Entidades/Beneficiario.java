package Entidades;

import java.util.List;

public class Beneficiario
{
    public List<Desempregado> Desempregado;
    public List<Empregador> Empregador;
    public List<Empregado> Empregado;

    public Beneficiario()
    {
    }

    public Beneficiario(List<Empregado> empregado, List<Desempregado> desempregado, List<Empregador> empregador)
    {
        Empregado = empregado;
        Desempregado = desempregado;
        Empregador = empregador;
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

    public List<Desempregado> getDesempregado()
    {
        return Desempregado;
    }

    public List<Empregado> getEmpregado()
    {
        return Empregado;
    }

    public List<Empregador> getEmpregador()
    {
        return Empregador;
    }
}
