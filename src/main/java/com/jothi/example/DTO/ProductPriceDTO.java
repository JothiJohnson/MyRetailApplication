package com.jothi.example.DTO;

public class ProductPriceDTO {
	private ProductDTO product;
	private PriceDTO price;
	
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public PriceDTO getPrice() {
		return price;
	}
	public void setPrice(PriceDTO price) {
		this.price = price;
	}
	public ProductPriceDTO(ProductDTO product, PriceDTO price) {
		super();
		this.product = product;
		this.price = price;
	}
	public ProductPriceDTO(ProductDTO product) {
		super();
		this.product = product;
	}
	public ProductPriceDTO() {
		super();
	}
	
	

}
