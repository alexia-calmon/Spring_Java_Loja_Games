package com.lojagames.lojagames.repository;

import com.lojagames.lojagames.model.Console;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ConsoleRepository extends JpaRepository<Console, Long> {
    public List<Console>  findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
