package com.banking.study;

public class MainAtributo {
    public static void main(String[] args) {
        PessoaAtributo pessoa = new PessoaAtributo();
        pessoa.nomePublico = "juliana";
        System.out.println(pessoa.nomePublico);

        Identidade NovaIdentidade = new Identidade();
        NovaIdentidade.Nome="Juliana Gomes Da Silva";
        NovaIdentidade.Email="JulianaGomes328@gmail.com";
        NovaIdentidade.Genero="Heterossexual";
        NovaIdentidade.Idade = 25;
        System.out.println(new StringBuilder().append("Meu Nome é ").append(NovaIdentidade.Nome).append(" tenho ").append(NovaIdentidade.Idade).toString());

        SaldoBancario NovoSaldo = new SaldoBancario();
        NovoSaldo.Deposito  = 250;
        NovoSaldo.Saque  = 100;
        NovoSaldo.SaldoAtual = 1240;

        System.out.println(NovoSaldo.SaldoAtual+NovoSaldo.Deposito-NovoSaldo.Saque);
    }
}
