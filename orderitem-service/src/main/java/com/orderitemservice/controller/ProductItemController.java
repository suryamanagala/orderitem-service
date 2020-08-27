package com.orderitemservice.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderitemservice.exception.ProductItemNotException;
import com.orderitemservice.model.ProductItem;
import com.orderitemservice.repository.ProductRepository;

@RestController
public class ProductItemController {
	
	Logger logger = LoggerFactory.getLogger(ProductItemController.class);
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/productItem/create")
	public ResponseEntity<Object> createOrderItem(@Valid @RequestBody ProductItem productItem) {
		
		logger.info("entered createOrderItem {} with dto ", productItem);
		if(productItem != null) {
			productRepository.save(productItem);
			
			logger.info("saved successfully {}", productItem);
		}
		
		return new ResponseEntity<>("Product Item is saved successfully", HttpStatus.OK);
		
	}
	
	@GetMapping("/product/getProductItems/{id}")
	public Optional<ProductItem> getProductItems(@PathVariable Long id){
		
		logger.info("entered createOrderItem {} with product item id ", id);
		if(!productRepository.findById(id).isPresent()) {
			
			throw new ProductItemNotException();
		}
		return productRepository.findById(id);
		
		
	}
	
	@GetMapping("/product/getAllProductItems")
	public List<ProductItem> getAllProductItems(){
		
		logger.info("entered getAllProductItems ");
		
		List<ProductItem> productItemList = productRepository.findAll();
		return productItemList;
		
		
	}

}
