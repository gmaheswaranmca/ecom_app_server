package com.mahesh.ecomsystem;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdController {
	@Autowired
	private ProductRepo repo;
	
	
	
	@PostMapping(path="products")
	public Product create(@RequestBody Product product) {
		product.setId(null);
		Product savedProduct = repo.save(product);		
		return savedProduct;
	}
	
	@GetMapping(path="products")
	public List<Product> findAll() {
		List<Product> products = repo.findAll();
		return products;
	}
	
	@GetMapping(path="products/{id}")
	public Product findById(@PathVariable String id) {
		Product product = repo.findById(id).get();
		return product;
	}
	
	@PutMapping(path="products/{id}")
	public Product update(@PathVariable String id, @RequestBody Product product) {
		Product oldProduct = repo.findById(id).get();
		oldProduct.setName(product.getName());
		oldProduct.setDescription(product.getDescription());
		oldProduct.setCategory(product.getCategory());
		oldProduct.setTags(product.getTags());
		oldProduct.setStock(product.getStock());
		oldProduct.setPrice(product.getPrice());
		//
		Product updatedProduct = repo.save(oldProduct);
		return updatedProduct;
	}
	
	@DeleteMapping(path="products/{id}")
	public boolean delete(@PathVariable String id) { 
		Optional<Product> optionalProduct = repo.findById(id);
		if(optionalProduct.isEmpty()) {
			return false;
		}
		repo.deleteById(id);
		return true;
	}
	
	@Autowired
    private TokenUtil jwtUtil;

    // Fake login just to issue token
    @PostMapping("/auth")
    public Map<String, String> authenticate(@RequestBody String username) {
        String token = jwtUtil.generateToken(username);
        return Map.of("token", token);
    }

    @GetMapping("/api/products")
    public List<String> getProducts() {
        return List.of("Laptop", "Phone", "Tablet", "Headphones");
    }
}
