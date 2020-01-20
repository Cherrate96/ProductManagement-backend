/**
 * 
 */
package com.home.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import com.home.domain.Produit;

/**
 * @author ADAM
 *
 */
@Transactional
public interface ProduitService {
	
	Page<Produit> findByDesignationContains(@Param(value = "mc") String des,Pageable pageable);
List<Produit> findAll();
Produit save(Produit p);
}
