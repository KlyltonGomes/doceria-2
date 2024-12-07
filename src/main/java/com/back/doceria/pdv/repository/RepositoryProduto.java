package com.back.doceria.pdv.repository;

import com.back.doceria.pdv.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduto extends JpaRepository<Produto,Long> {
}
