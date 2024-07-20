package br.com.academy.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.academy.models.Pessoa;
import br.com.academy.repositoty.Repositorio;

@RestController
public class controler {
    
    @Autowired
    private Repositorio acao;

    @GetMapping("/hello")
    public String mensagem(){
        return "Hello World";
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo(a)";
    }

    @GetMapping("/boasvindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Bem vindo(a) " + nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p)
   {
        return p;
   } 
}
