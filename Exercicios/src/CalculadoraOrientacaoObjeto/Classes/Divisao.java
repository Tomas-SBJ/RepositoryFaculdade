package CalculadoraOrientacaoObjeto.Classes;

public class Divisao extends Operacao
{
    public double calcular(double numero1, double numero2)
    {
        if (numero2 == 0)
        {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }

        return numero1 / numero2;
    }
}
