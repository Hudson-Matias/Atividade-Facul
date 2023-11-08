package org.example;

import org.example.Domain.Banco;
import org.example.Domain.Enuns.TipoConta;
import org.example.Domain.Extrato;
import org.example.Domain.Pessoa;
import org.example.Domain.Saldo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTest {

    private Banco banco;
    private Pessoa titular;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
        titular = new Pessoa("João", "123.456.789-00");
    }

    @Test
    public void testCriarContaPoupanca() {
        banco.criarConta(TipoConta.POUPANCA, titular);
        assertEquals(1, banco.contas.size());
    }

    @Test
    public void testCriarContaSalario() {
        banco.criarConta(TipoConta.SALARIO, titular);
        assertEquals(1, banco.contas.size());
    }

    @Test
    public void testCriarContaCorrente() {
        banco.criarConta(TipoConta.CORRENTE, titular);
        assertEquals(1, banco.contas.size());
    }

    @Test
    public void testDepositar() {
        banco.criarConta(TipoConta.POUPANCA, titular);
        banco.contas.get(0).depositar(500.0);
        assertEquals(1500.0, banco.contas.get(0).getSaldo());
    }

    @Test
    public void testSaque() {
        banco.criarConta(TipoConta.CORRENTE, titular);
        banco.contas.get(0).depositar(1000.0);
        banco.contas.get(0).sacar(300.0);
        assertEquals(700.0, banco.contas.get(0).getSaldo());
    }

    @Test
    public void testGetSaldo() {
        Saldo saldo = new Saldo(1000.0);
        assertEquals(1000.0, saldo.getSaldo());
    }

    @Test
    public void testSetSaldo() {
        Saldo saldo = new Saldo(1000.0);
        saldo.setSaldo(1500.0);
        assertEquals(1500.0, saldo.getSaldo());
    }

    @Test
    public void testGetDescricao() {
        Extrato extrato = new Extrato("Descrição do extrato");
        assertEquals("Descrição do extrato", extrato.getDescricao());
    }

    @Test
    public void testSetDescricao() {
        Extrato extrato = new Extrato("Descrição do extrato");
        extrato.setDescricao("Nova descrição do extrato");
        assertEquals("Nova descrição do extrato", extrato.getDescricao());
    }
}