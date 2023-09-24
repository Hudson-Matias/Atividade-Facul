package org.example.Domain;

import org.example.Domain.Enuns.TipoConta;
import org.example.Domain.TipoConta.ContaCorrente;
import org.example.Domain.TipoConta.ContaPoupanca;
import org.example.Domain.TipoConta.ContaSalario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public List<Conta> contas = new ArrayList<>();

    public void criarConta(TipoConta tipoConta, Pessoa titular) {
        Conta conta = null;

        switch (tipoConta) {
            case POUPANCA:
                conta = new ContaPoupanca(titular);
                break;
            case SALARIO:
                conta = new ContaSalario(titular);
                break;
            case CORRENTE:
                conta = new ContaCorrente(titular);
                break;
            default:
                System.out.println("Tipo de conta inválido.");
        }

        if (conta != null) {
            contas.add(conta);
            System.out.println("Conta criada com sucesso.");
            System.out.printf("Conta %s criada para %s (CPF: %s).%n", tipoConta, titular.getNome(), titular.getCpf());
        }
    }
}
