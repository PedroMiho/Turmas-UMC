package com.urbanvibe.lojaRoupa.repository;

import com.urbanvibe.lojaRoupa.model.Roupa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoupaRepository extends JpaRepository<Roupa, Long> {
    List<Roupa> findByNomeProduto(String nomeProduto);

    List<Roupa> findByNomeProdutoAndMarca(String nomeProduto, String marca);

    List<Roupa> findByMarca(String marca);
}
