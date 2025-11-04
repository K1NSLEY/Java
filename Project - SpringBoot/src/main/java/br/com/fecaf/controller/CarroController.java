package br.com.fecaf.controller;

import br.com.fecaf.model.Carro;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/carros")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CarroController {

    List<Carro> carros = new ArrayList<>();

    // 🔹 O método será chamado automaticamente ao iniciar a aplicação
    @PostConstruct
    public void carregarJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = getClass()
                    .getResourceAsStream("/data/carros.json");

            carros = objectMapper.readValue(inputStream, new TypeReference<List<Carro>>() {});
            System.out.println("✅ JSON de carros carregado com sucesso: " + carros.size() + " carros.");
        } catch (Exception e) {
            System.err.println("❌ Erro ao carregar o JSON de carros: " + e.getMessage());
        }
    }


    @GetMapping
    public List<Carro> listarCarros () {
        return carros;
    }


}