package com.farmacia.projetofarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.projetofarmacia.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
}
