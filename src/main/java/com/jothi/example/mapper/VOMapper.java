package com.jothi.example.mapper;

import com.jothi.example.DTO.ProductPriceDTO;
import com.jothi.example.domain.ProductPriceVO;


public class VOMapper {
	
	
	public ProductPriceVO DTOtoVO (ProductPriceDTO productpriceDto) {
		
		ProductPriceVO productprice = new ProductPriceVO();
		productprice.setProductId(productpriceDto.getProduct().getProductId());
		productprice.setPrice(productpriceDto.getPrice().getPrice());
		productprice.setCurrency(productpriceDto.getPrice().getCurrency());
		
		return productprice;

	}

}
