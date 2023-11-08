package org.example;

import org.example.Domain.Pessoa;
import org.example.Domain.TipoConta.ContaPoupanca;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTest {
    @Test
    public void testVerSaldo() {
        Pessoa joao = new Pessoa("João", "123.456.789-00");
        ContaPoupanca conta = new ContaPoupanca(joao);

        assertEquals(1000.0, conta.getSaldo());

        conta.depositar(1000.0);

        assertEquals(2000.0, conta.getSaldo());
    }
}
