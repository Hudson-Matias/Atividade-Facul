package org.example.Service;

import org.example.Domain.Extrato;

public interface OperacoesConta {
    void depositar(double valor);
    void sacar(double valor);
    void verSaldo();
    void verExtrato();
    double getSaldo();
}
