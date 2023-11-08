package org.example.Domain;

import org.example.Exceptions.SaldoInsuficienteException;

public class Saque {
    public static void realizarSaque(Conta conta, double valor) throws SaldoInsuficienteException {
        if (valor > 0 && valor <= conta.getSaldo()) {
            conta.sacar(valor);
            System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
        } else {
            throw new SaldoInsuficienteException("Valor de saque inválido ou saldo insuficiente.");
        }
    }
}
