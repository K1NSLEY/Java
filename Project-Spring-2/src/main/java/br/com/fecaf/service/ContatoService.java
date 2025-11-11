package br.com.fecaf.service;

import br.com.fecaf.model.Contato;
import br.com.fecaf.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    //Service para listar Contatos
    public List<Contato> listarContatos() {
        return contatoRepository.findAll();
    }

    public void deletarCpmtato(int id){
        contatoRepository.deleteById(id);
    }
}
