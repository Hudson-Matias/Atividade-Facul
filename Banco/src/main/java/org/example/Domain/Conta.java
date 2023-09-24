package org.example.Domain;

import org.example.Service.OperacoesConta;

public abstract class Conta implements OperacoesConta {
    protected Pessoa titular;
    protected double saldo;
    protected Extrato extrato;

    public Conta(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new Extrato("Extrato inicial");
    }

    public void depositar(double valor) {
        saldo += valor;
        extrato.setDescricao("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            extrato.setDescricao("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            extrato.setDescricao("Saldo insuficiente para saque de R$" + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void verSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    public Extrato getExtrato() {
        return extrato;
    }

    public void verExtrato() {
        System.out.println("Extrato da conta de " + titular.getNome() + ":");
        System.out.println(extrato.getDescricao());
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}
