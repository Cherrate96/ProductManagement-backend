package com.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.home.domain.Produit;
import com.home.service.ProduitService;
import com.home.service.Impl.ProduitServiceImpl;

/**
 * @author ADAM
 *
 */
@RestController
public class ProduitREST {
@Autowired
private ProduitService produitService;


@GetMapping("/listproduits")
public List<Produit> findAll()
{
return produitService.findAll();		
}

@PostMapping("/add")
public Produit add(Produit p)
{
	return produitService.save(p);
}
}
