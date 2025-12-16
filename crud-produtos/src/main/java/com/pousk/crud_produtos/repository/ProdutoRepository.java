package com.pousk.crud_produtos.repository;

import com.pousk.crud_produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
