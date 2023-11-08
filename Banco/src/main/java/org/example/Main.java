package org.example;

import org.example.Domain.Banco;
import org.example.Domain.Conta;
import org.example.Domain.Enuns.TipoConta;
import org.example.Domain.Pessoa;

import static org.example.Domain.Tranferencia.realizarTransferencia;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Maria", "987.654.321-00");

        banco.criarConta(TipoConta.POUPANCA, pessoa1);
        banco.criarConta(TipoConta.SALARIO, pessoa2);

        Conta contaJoao = banco.contas.get(0);
        Conta contaMaria = banco.contas.get(1);

        contaJoao.depositar(1000.0);
        contaMaria.depositar(1500.0);

        realizarTransferencia(contaJoao, contaMaria, 500.0);

        contaJoao.verSaldo();
        contaMaria.verSaldo();
        contaJoao.verExtrato();
        contaMaria.verExtrato();
    }
}