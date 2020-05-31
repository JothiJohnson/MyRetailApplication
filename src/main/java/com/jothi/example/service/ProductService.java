package com.jothi.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jothi.example.DTO.ProductPriceDTO;
import com.jothi.example.dao.ProductPriceRepository;
import com.jothi.example.domain.ProductPriceVO;
import com.jothi.example.domain.ProductVO;
import com.jothi.example.domain.RootVO;
import com.jothi.example.mapper.DTOMapper;
import com.jothi.example.mapper.VOMapper;

/*
 * Sample service to demonstrate what the API would use to get things done
 */
@Service
@Component
public class ProductService {

	@Value("${uri.prefix}")
	private String uriPrefix;

	@Value("${uri.suffix}")
	private String uriSuffix;

	@Autowired
	private ProductPriceRepository productPriceRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	

	private static final Logger log = LoggerFactory.getLogger(ProductService.class);

	public ProductService() {
	}

	/* This method will retrieve the Product details based on product id
	 * @param Id
	 */
	public ProductPriceDTO getProduct(long id) throws Exception {

		final String uri = uriPrefix + String.valueOf(id) +"?"+ uriSuffix ;
		System.out.println(uri);
		
		//External API call
		//RestTemplate restTemplate = new RestTemplate();
		RootVO root = restTemplate.getForObject(uri, RootVO.class);
		System.out.println("result:" + root);
    	ProductVO product = root.getProduct();
    	
    	
        //Get Price info from Nosql data store
		ProductPriceVO productPrice = productPriceRepository.findOne(String.valueOf(id));
		
        //Transform the object for the output response
		DTOMapper m = new DTOMapper();
		ProductPriceDTO pc = null;
		if (productPrice == null) {
			pc = m.VOtoDTO(product);
		} else {
			pc = m.VOtoDTO(product, productPrice);
		}

		return (pc);

	}
	/* This methis will save the price information in the data store
	 * @Param ProductPriceDTO
	 * */
	public void createProduct(ProductPriceDTO productPriceDTO) {

		VOMapper m = new VOMapper();
		ProductPriceVO pp = new ProductPriceVO();
		pp = m.DTOtoVO(productPriceDTO);
		productPriceRepository.save(pp);



	}

}
