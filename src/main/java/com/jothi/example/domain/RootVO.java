package com.jothi.example.domain;

import org.springframework.stereotype.Component;

@Component

public class RootVO {
	private ProductVO product;

	public ProductVO getProduct() {
		return product;
	}

	public void setProduct(ProductVO product) {
		this.product = product;
	}
	
	

}
