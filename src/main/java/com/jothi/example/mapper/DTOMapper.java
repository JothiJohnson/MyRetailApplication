package com.jothi.example.mapper;

import org.springframework.stereotype.Component;

import com.jothi.example.DTO.PriceDTO;
import com.jothi.example.DTO.ProductDTO;
import com.jothi.example.DTO.ProductPriceDTO;
import com.jothi.example.domain.ProductPriceVO;
import com.jothi.example.domain.ProductVO;

@Component
public class DTOMapper {

	public ProductPriceDTO VOtoDTO(ProductVO product, ProductPriceVO productPrice) {

		ProductDTO productDto = new ProductDTO();
		productDto.setProductId(product.getAvailableToPromiseNetwork().getProductId());
		productDto.setProductName(product.getItem().getProductDescription().getTitle());

		PriceDTO priceDto = new PriceDTO();
		priceDto.setPrice(productPrice.getPrice());
		priceDto.setCurrency(productPrice.getCurrency());
		ProductPriceDTO result = new ProductPriceDTO(productDto, priceDto);

		return (result);
	}

	public ProductPriceDTO VOtoDTO(ProductVO product) {

		ProductDTO productDto = new ProductDTO();
		productDto.setProductId(product.getAvailableToPromiseNetwork().getProductId());
		productDto.setProductName(product.getItem().getProductDescription().getTitle());
		ProductPriceDTO result = new ProductPriceDTO(productDto);

		return (result);
	}

}
