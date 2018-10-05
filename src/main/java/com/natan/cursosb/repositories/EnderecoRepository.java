package com.natan.cursosb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursosb.domain.Endereco;;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
