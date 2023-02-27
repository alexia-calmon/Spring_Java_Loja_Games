package com.lojagames.lojagames.repository;

import com.lojagames.lojagames.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {

    public List<Jogo> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
