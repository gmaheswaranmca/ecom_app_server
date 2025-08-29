package com.mahesh.ecomsystem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/products")
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping
	public ResponseEntity<Product> create(@RequestBody Product product) {
		Product savedProduct = service.create(product);		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
	}
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> products = service.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(products);
	}
	@GetMapping(path="/{id}")
	public ResponseEntity<Product> findById(@PathVariable String id) {
		Product product = service.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
	@PutMapping(path="/{id}")
	public ResponseEntity<Product> update(@PathVariable String id, @RequestBody Product product) {
		Product updatedProduct = service.update(id, product);
		return ResponseEntity.status(HttpStatus.OK).body(updatedProduct);
	}
	@DeleteMapping(path="{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) { 
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
