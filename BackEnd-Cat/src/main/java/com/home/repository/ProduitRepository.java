package com.home.repository;

import java.util.List;



import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.home.domain.Produit;

/**
 * @author ADAM
 *
 */
@RepositoryRestResource
@CrossOrigin("*")

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
//@RestResource(path = "/byDesignation")
//	public List<Produit> findByDesignationContains(@Param(value = "mc") String des);
@RestResource(path = "/byDesignationPage")
public Page<Produit> findByDesignationContains(@Param(value = "mc") String des,Pageable pageable);
// 

public List<Produit> findAll();
public Produit save(Produit p);



}
