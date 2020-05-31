package com.jothi.example.test.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.jothi.example.DTO.ProductPriceDTO;
import com.jothi.example.mapper.DTOMapper;
import com.jothi.example.test.util.DataUtil;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
public class DTOMapperTest extends TestCase{
	
	@Test
	public void VOtoDTOTest1()
	{
		DTOMapper dtoMapper = new DTOMapper();
		
		ProductPriceDTO ppd = new ProductPriceDTO();
		ppd= dtoMapper.VOtoDTO(DataUtil.mockProductVO(),DataUtil.mockProductPriceVO());
		assertEquals(new Long (123456789L) ,ppd.getProduct().getProductId());
		assertEquals("Testing",ppd.getProduct().getProductName());
		assertEquals(45.45,ppd.getPrice().getPrice());
		assertEquals("USD",ppd.getPrice().getCurrency());
		
	}
	
	@Test
	public void VOtoDTOTest2()
	{
		DTOMapper dtoMapper = new DTOMapper();
		
		ProductPriceDTO ppd = new ProductPriceDTO();
		ppd= dtoMapper.VOtoDTO(DataUtil.mockProductVO());
		assertEquals(new Long (123456789L) ,ppd.getProduct().getProductId());
		assertEquals("Testing",ppd.getProduct().getProductName());
		
	}
	
	
	

}
