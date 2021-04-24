import Entidades.Beneficiario;
import Entidades.Desempregado;
import Entidades.Empregado;
import Entidades.Empregador;

import java.util.*;

public class ResolucaoProva extends Metodos
{
    public static void main(String[] args)
    {
        List<Beneficiario> beneficiarios = new ArrayList<>();
        List<Empregado> empregados = new ArrayList<>();
        List<Empregador> empregadores = new ArrayList<>();
        List<Desempregado> desempregados = new ArrayList<>();

        boolean loop = true;
        int categoria;
        int mesesDesempregado;
        int quantidadeFuncionarios;
        int mesesAuxilio;
        int dataNascimento;
        int maiorTempo1 = 0;
        int maiorTempo2 = 0;
        String continuar;
        String nome;
        String uf;
        String aposentado;
        String maiorIdade;
        String nomeCategoria;
        String beneficiarioMaiorValor1 = null;
        String beneficiarioMaiorValor2 = null;
        String beneficiarioMaiorTempo1 = null;
        String beneficiarioMaiorTempo2 = null;
        double beneficioInicial;
        double beneficioFinal;
        double valorBeneficioFuncionarios;
        double acrescimoEstados;
        double valorTotalBeneficiarios = 0;
        double maiorBeneficio1 = 0;
        double maiorBeneficio2 = 0;

        Scanner teclado = new Scanner(System.in);

        while(loop)
        {
            Beneficiario beneficiario = new Beneficiario();

            do
            {
                System.out.println("Digite seu nome completo.");
                nome = teclado.nextLine();
            }
            while (nome.isEmpty());

            System.out.println("Digite seu ano de nascimento. Ex: 2003");
            dataNascimento = teclado.nextInt();
            maiorIdade = validarIdade(dataNascimento);

            System.out.println("Digite seu UF. (Ex: SC)");
            uf = teclado.next().toUpperCase();
            validarUF(uf);

            System.out.println("""
                    Escolha uma categoria:
                    Categoria 1 - Empregado
                    Categoria 2 - Empregador
                    Categoria 3 - Desempregado
                    """);
            categoria = teclado.nextInt();
            nomeCategoria = converterCategoria(categoria);

            switch (categoria)
            {
                case 1 ->
                {
                    Empregado empregado = new Empregado();

                    System.out.println("Digite a quantidade de meses que vai receber o auxilio");
                    mesesAuxilio = teclado.nextInt();
                    validarMes(mesesAuxilio);

                    System.out.println("Digite o valor do auxilio.");
                    beneficioInicial = teclado.nextDouble();
                    validarBeneficioInicial(categoria, beneficioInicial);

                    System.out.println("Empregado aposentado ? (Sim - Não)");
                    aposentado = teclado.next();
                    validarAposentado(aposentado);

                    acrescimoEstados = beneficioEstados(uf, beneficioInicial);

                    beneficioFinal = beneficioInicial + acrescimoEstados;

                    empregado.setCategoria(categoria);
                    empregado.setNome(nome);
                    empregado.setAnoNascimento(dataNascimento);
                    empregado.setUf(uf);
                    empregado.setValorBeneficio(beneficioFinal);
                    empregado.setMesesAuxilio(mesesAuxilio);
                    empregado.setAposentado(aposentado);
                    empregados.add(empregado);

                    switch (uf)
                    {
                        case "PA" ->
                                System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                        dataNascimento + " " + maiorIdade + ", usuário é do Pará então terá um acrescimo de R$"
                                        + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Usuário é aposentado ? (" +
                                        aposentado + "), benefício será de " + mesesAuxilio +
                                        " meses e o valor do benefício será de R$" + beneficioFinal);

                        case "SP" ->
                                System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                        dataNascimento + " " + maiorIdade + ", usuário é de São Paulo então terá um acrescimo de R$"
                                        + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Usuário é aposentado ? (" +
                                        aposentado + "), benefício será de " + mesesAuxilio +
                                        " meses e o valor do benefício será de R$" + beneficioFinal);

                        case "PE" ->
                                System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                        dataNascimento + " " + maiorIdade + ", usuário é de Pernambuco então terá um acrescimo de R$"
                                        + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Usuário é aposentado ? (" +
                                        aposentado + "), benefício será de " + mesesAuxilio +
                                        " meses e o valor do benefício será de R$" + beneficioFinal);

                        default ->
                                System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                        dataNascimento + " " + maiorIdade + ". Categoria - " + nomeCategoria + ". Usuário é aposentado ? (" +
                                        aposentado + "), benefício será de " + mesesAuxilio +
                                        " meses e o valor do benefício será de R$" + beneficioFinal);
                    }
                }

                case 2 ->
                {
                    Empregador empregador = new Empregador();

                    System.out.println("Digite a quantidade de funcionarios.");
                    quantidadeFuncionarios = teclado.nextInt();

                    beneficioInicial = quantidadeFuncionarios * 200;
                    acrescimoEstados = beneficioEstados(uf, beneficioInicial);

                    beneficioInicial = beneficioInicial + acrescimoEstados;

                    valorBeneficioFuncionarios = beneficioEmpregadores(quantidadeFuncionarios, beneficioInicial);
                    mesesAuxilio = mesesEmpregador(categoria);

                    beneficioFinal = beneficioInicial + valorBeneficioFuncionarios;

                    empregador.setCategoria(categoria);
                    empregador.setNome(nome);
                    empregador.setAnoNascimento(dataNascimento);
                    empregador.setUf(uf);
                    empregador.setValorBeneficio(beneficioFinal);
                    empregador.setMesesAuxilio(mesesAuxilio);
                    empregador.setQuantidadeFuncionarios(quantidadeFuncionarios);
                    empregadores.add(empregador);

                    if (quantidadeFuncionarios <= 50)
                    {
                        switch (uf)
                        {
                            case "PA" ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + ", usuário é do Pará e possui " + quantidadeFuncionarios +
                                            " funcionarios então terá um acrescimo de R$" + (acrescimoEstados + valorBeneficioFuncionarios) +
                                            ". Categoria - " + nomeCategoria + ". Benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);

                            case "SP" ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + ", usuário é de São Paulo e possui " + quantidadeFuncionarios +
                                            " funcionarios então terá um acrescimo de R$" + (acrescimoEstados + valorBeneficioFuncionarios) +
                                            ". Categoria - " + nomeCategoria + ". Benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);

                            case "PE" ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + ", usuário é de Pernambuco e possui " + quantidadeFuncionarios +
                                            " funcionarios então terá um acrescimo de R$" + (acrescimoEstados + valorBeneficioFuncionarios) +
                                            ". Categoria - " + nomeCategoria + ". Benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);

                            default ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + "" + ". Categoria - " + nomeCategoria + ". Possui " +
                                            quantidadeFuncionarios + " funcionarios então terá um acrescimo de R$" +
                                            valorBeneficioFuncionarios + ". Benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);
                        }
                    }
                    else
                    {
                        switch (uf)
                        {
                            case "PA" ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + ", usuário é do Pará então terá um acrescimo de R$"
                                            + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Possui " +
                                            quantidadeFuncionarios + " funcionarios, benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);

                            case "SP" ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + ", usuário é de São Paulo então terá um acrescimo de R$"
                                            + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Possui " +
                                            quantidadeFuncionarios + " funcionarios, benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);

                            case "PE" ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + ", usuário é Pernambuco e então terá um acrescimo de R$"
                                            + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Possui " +
                                            quantidadeFuncionarios + " funcionarios, benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);

                            default ->
                                    System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                            dataNascimento + " " + maiorIdade + ". Categoria - " + nomeCategoria + ". Possui " +
                                            quantidadeFuncionarios + " funcionarios, benefício será de " + mesesAuxilio +
                                            " meses e o valor do benefício será de R$" + beneficioFinal);
                        }
                    }
                }

                case 3 ->
                {
                    Desempregado desempregado = new Desempregado();

                    System.out.println("Digite a quantidade de meses que vai receber o auxilio");
                    mesesAuxilio = teclado.nextInt();
                    validarMes(mesesAuxilio);

                    System.out.println("Digite o valor do auxilio.");
                    beneficioInicial = teclado.nextDouble();
                    validarBeneficioInicial(categoria, beneficioInicial);

                    System.out.println("Digite a quantidade de meses desempregado.");
                    mesesDesempregado = teclado.nextInt();

                    acrescimoEstados = beneficioEstados(uf, beneficioInicial);

                    beneficioFinal = beneficioInicial + acrescimoEstados;

                    desempregado.setCategoria(categoria);
                    desempregado.setNome(nome);
                    desempregado.setAnoNascimento(dataNascimento);
                    desempregado.setUf(uf);
                    desempregado.setValorBeneficio(beneficioFinal);
                    desempregado.setMesesAuxilio(mesesAuxilio);
                    desempregado.setMesesDesempregado(mesesDesempregado);
                    desempregados.add(desempregado);

                    switch (uf)
                    {
                        case "PA" ->
                            System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                    dataNascimento + " " + maiorIdade + ", usuário é do Pará e então terá um acrescimo de R$"
                                    + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Está à " +
                                    mesesDesempregado + " meses desempregado, benefício será de " + mesesAuxilio +
                                    " meses e o valor do benefício será de R$" + beneficioFinal);

                        case "SP" ->
                            System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                    dataNascimento + " " + maiorIdade + ", usuário é de São Paulo e então terá um acrescimo de R$"
                                    + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Está à " +
                                    mesesDesempregado + " meses desempregado, benefício será de " + mesesAuxilio +
                                    " meses e o valor do benefício será de R$" + beneficioFinal);

                        case "PE" ->
                            System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                    dataNascimento + " " + maiorIdade + ", usuário é de Pernambuco e então terá um acrescimo de R$"
                                    + acrescimoEstados + ". Categoria - " + nomeCategoria + ". Está à " +
                                    mesesDesempregado + " meses desempregado, benefício será de " + mesesAuxilio +
                                    " meses e o valor do benefício será de R$" + beneficioFinal);

                        default ->
                                System.out.println("Cadastro realizado com sucesso: " + nome + ", nascido no ano de " +
                                        dataNascimento + " " + maiorIdade + ". Categoria - " + nomeCategoria + ". Está à " +
                                        mesesDesempregado + " meses desempregado, benefício será de " + mesesAuxilio +
                                        " meses e o valor do benefício será de R$" + beneficioFinal);
                    }
                }

                default -> throw new IllegalArgumentException("Categoria inválida.");
            }

            beneficiario.setEmpregado(empregados);
            beneficiario.setEmpregador(empregadores);
            beneficiario.setDesempregado(desempregados);
            beneficiarios.add(beneficiario);

            System.out.println("Deseja adicionar um novo beneficiário ? (Sim - Não)");
            continuar = teclado.next();

            if (maiorBeneficio1 < beneficioFinal)
            {
                beneficiarioMaiorValor1 = nome;
                maiorBeneficio1 = beneficioFinal;
            }
            else if (maiorBeneficio2 < maiorBeneficio1 && maiorBeneficio2 < beneficioFinal)
            {
                beneficiarioMaiorValor2 = nome;
                maiorBeneficio2 = beneficioFinal;
            }

            if (maiorTempo1 < mesesAuxilio)
            {
                beneficiarioMaiorTempo1 = nome;
                maiorTempo1 = mesesAuxilio;
            }
            else if (maiorTempo2 < maiorTempo1 && maiorTempo2 < mesesAuxilio)
            {
                beneficiarioMaiorTempo2 = nome;
                maiorTempo2 = mesesAuxilio;
            }

            if (continuar.equals("Não"))
            {
                loop = false;
            }

            valorTotalBeneficiarios += beneficioFinal;
        }

        System.out.println("Total de beneficiários: " + beneficiarios.size());
        System.out.println("Total de valor que será concedido: " + valorTotalBeneficiarios);
        System.out.println("Beneficiário à receber o maior valor: " + beneficiarioMaiorValor1);
        System.out.println("Beneficiário à receber o segundo maior valor: " + beneficiarioMaiorValor2);
        System.out.println("Beneficiário à receber o benefício por mais tempo: " + beneficiarioMaiorTempo1);
        System.out.println("Beneficiário à receber o segundo benefício por mais tempo: " + beneficiarioMaiorTempo2);

        teclado.close();
    }
}