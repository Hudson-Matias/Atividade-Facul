package org.example.Domain.TipoConta;

import org.example.Domain.Conta;
import org.example.Domain.Pessoa;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Pessoa titular) {
        super(titular);
        setSaldo(1000.0);
        setExtrato("Extrato inicial");
    }

    public void setSaldo(double v) {
        this.saldo = v;
    }

    public void setExtrato(String extratoInicial) {
        this.extrato.setDescricao(extratoInicial);
    }
}
