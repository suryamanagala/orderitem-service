package com.orderitemservice.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ProductItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Id 
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long productCode;
	
	@Column
	private String productName;
	
	@Column
	private Integer qunatity;
	@Column
	private BigDecimal productPrice;
	public Long getProductCode() {
		return productCode;
	}
	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQunatity() {
		return qunatity;
	}
	public void setQunatity(Integer qunatity) {
		this.qunatity = qunatity;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	
	
//	public ProductItem(Long productCode, String productName, Integer qunatity, BigDecimal productPrice) {
//		super();
//		this.productCode = productCode;
//		this.productName = productName;
//		this.qunatity = qunatity;
//		this.productPrice = productPrice;
//	}
//	
//	public ProductItem() {
//		
//	}
}
