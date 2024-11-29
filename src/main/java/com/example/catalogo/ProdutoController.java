package com.example.catalogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        repository.save(produto);
        return produto;
    }

    @GetMapping
    public List<Produto> list(){
        return repository.findAll();
    }

}
