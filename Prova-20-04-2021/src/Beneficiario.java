import java.util.Calendar;

public class Beneficiario
{
    public String Nome;
    public Calendar DataNascimento;
    public String Aposentado;
    public String UF;
    public int Categoria;
    public double ValorBeneficio;

    protected Beneficiario()
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
}
