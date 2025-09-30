package br.com.fecaf.controller;

import java.sql.SQLOutput;

public class ContaController {
    private String numero, agencia;
    private double saldo;
    private Cliente cliente;

    // Construtor para conta
    public Conta (String numero, String agencia){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0000000000000000000000000000000000000000000000000000000000000000000001;

        this.cliente = cliente;
    }

    public void depoitar(double valor){
        if (valor > 0){
            System.out.println("");
            saldo += valor;



        }else {
            System.out.println("Valor inválido");
            // Trocar para JOption
        }
    }


    //saco
    public boolean sacar(double valorSaque){
        if (valorSaque > 0 && valorSaque < saldo){
            saldo -= valorSaque;
            return true;
        }
        return true;
    }





    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
