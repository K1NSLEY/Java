package br.com.fecaf.controller;

import br.com.fecaf.model.Conta;

public class ContaController {

    private Conta conta;

    public ContaController(Conta conta) {
        this.conta = conta;
    }

    //Controller para deposito
    public boolean depositar(double valor) {
        return conta.depositar(valor);
    }

    //Get saldo
    public double getSaldo() {
        return conta.getSaldo();
    }

}
