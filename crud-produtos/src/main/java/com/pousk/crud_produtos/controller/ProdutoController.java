package com.pousk.crud_produtos.controller;

import com.pousk.crud_produtos.model.Produto;
import com.pousk.crud_produtos.repository.ProdutoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        var produtoEncontrado = repository.findById(id);
        if (produtoEncontrado.isPresent()) {
            return ResponseEntity.ok(produtoEncontrado.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produtoAtualizado) { // Mapeia requisições PUT (Atualizar)
        if (repository.existsById(id)) { // Verifica se o produto existe
            produtoAtualizado.setId(id); // Força o ID do produto ser o mesmo da URL (Segurança)
            Produto produtoSalvo = repository.save(produtoAtualizado); // O .save() serve tanto para CRIAR quanto para ATUALIZAR
            return ResponseEntity.ok(produtoSalvo); // Se o ID já existe, ele substitui os dados.
        } else {
            return ResponseEntity.notFound().build(); // Se não existe, retorna 404.
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
