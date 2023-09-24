package org.example.Domain;

import org.example.Domain.TipoConta.ContaPoupanca;

public class Tranferencia {
    public static void realizarTransferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem.getSaldo() >= valor) {
            double valorRealTransferido = valor;

            if (contaOrigem instanceof ContaPoupanca) {
                valorRealTransferido += 50.0;
            }
            contaOrigem.sacar(valorRealTransferido);
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$%.2f realizada com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }
}
