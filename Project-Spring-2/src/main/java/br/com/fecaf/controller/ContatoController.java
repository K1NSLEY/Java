package br.com.fecaf.controller;

import br.com.fecaf.model.Contato;
import br.com.fecaf.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contatos")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    //Listar Contatos
    @GetMapping
    public List<Contato> listarContatos () {
        return contatoService.listarContatos();
    }

    //Deletar Contato
    @DeleteMapping("/deletarContato/{id}")
    public void deletarContato(@PathVariable int id){
        contatoService.deletarContato(id);
    }
}
