package br.com.fecaf.controller;

import br.com.fecaf.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    // Isso cria uma lista para armazenar os clientes cadastrados
    List<Cliente> listClient = new ArrayList<>();

    // Adicionar um Cliente
    public boolean addClient (Cliente cliente) {
        listClient.add(cliente);
        System.out.println("Cliente Adicionado na Lista ");
        return true;
    }

        //Pesquisar Cliente
        public Cliente pesquisarCliente (String cpf) {
            for (Cliente cliente : listClient) {
                if (cliente.getCpf().equals(cpf)) {
                    System.out.println("Cliente Encontrado !");
                    return cliente;
                }
            }
            System.out.println("Cliente não Encontrado!");
            return null;
        }





}
