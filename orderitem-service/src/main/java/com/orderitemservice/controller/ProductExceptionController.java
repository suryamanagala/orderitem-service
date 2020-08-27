package com.orderitemservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.orderitemservice.exception.ProductItemNotException;

@ControllerAdvice
public class ProductExceptionController {

	   @ExceptionHandler(value = ProductItemNotException.class)
	   public ResponseEntity<Object> exception(ProductItemNotException exception) {
	      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	   }
}
