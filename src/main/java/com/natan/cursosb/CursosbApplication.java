package com.natan.cursosb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.natan.cursosb.domain.Categoria;
import com.natan.cursosb.repositories.CategoriaRepository;

@SpringBootApplication
public class CursosbApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursosbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");	
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
		
	}
}
