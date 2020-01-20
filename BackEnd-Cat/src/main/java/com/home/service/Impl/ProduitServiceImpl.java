package com.home.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.home.domain.Produit;
import com.home.repository.ProduitRepository;
import com.home.service.ProduitService;
/**
 * @author ADAM
 *
 */
@Service
public class ProduitServiceImpl implements ProduitService{
@Autowired
	private ProduitRepository produitRepository;

@Override
public Page<Produit> findByDesignationContains(String des, Pageable pageable) {
	// TODO Auto-generated method stub
	return produitRepository.findByDesignationContains(des, pageable);
}

@Override
public List<Produit> findAll() {
	// TODO Auto-generated method stub
	return produitRepository.findAll();
}

@Override
public Produit save(Produit p) {
	// TODO Auto-generated method stub
	return produitRepository.save(p);
}


	
}
