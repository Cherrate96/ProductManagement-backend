 package com.home;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.home.repository.ProduitRepository;
import com.home.domain.Produit;

@SpringBootApplication
public class BackEndCatApplication implements CommandLineRunner{
@Autowired
	private ProduitRepository produitRepository;
@Autowired
private RepositoryRestConfiguration repositoruRestConfig;
	public static void main(String[] args) {
		SpringApplication.run(BackEndCatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoruRestConfig.exposeIdsFor(Produit.class);
		
		produitRepository.save(new Produit("ordinateur lx 45", 6500, 2));
		produitRepository.save(new Produit("smartphone  245", 5000, 12));
		produitRepository.save(new Produit("tablette 245", 4500, 8));

		produitRepository.findAll().forEach(p->{
			System.out.println(p.getDesignation());
		});
	}

}
