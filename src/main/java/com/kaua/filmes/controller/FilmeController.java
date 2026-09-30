package com.kaua.filmes.controller;

import com.kaua.filmes.model.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> listaDeFilmes = new ArrayList<>();

    public FilmeController() {
        // Desafio extra: registar pelo menos 3 filmes diferentes no sistema
        listaDeFilmes.add(new Filme(1L, "O Padrinho", "Crime/Drama", 1972));
        listaDeFilmes.add(new Filme(2L, "O Senhor dos Anéis: A Irmandade do Anel", "Fantasia", 2001));
        listaDeFilmes.add(new Filme(3L, "Matrix", "Ficção Científica", 1999));
    }

    @GetMapping
    public List<Filme> listarFilmes() {
        return listaDeFilmes;
    }
}