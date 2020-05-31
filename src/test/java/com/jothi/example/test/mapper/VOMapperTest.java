package com.jothi.example.test.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.jothi.example.DTO.ProductPriceDTO;
import com.jothi.example.domain.ProductPriceVO;
import com.jothi.example.mapper.DTOMapper;
import com.jothi.example.mapper.VOMapper;
import com.jothi.example.test.util.DataUtil;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
public class VOMapperTest extends TestCase{
	
	@Test
	public void DTOtoVOTest()
	{
		VOMapper voMapper = new VOMapper();
		
		ProductPriceVO ppv = new ProductPriceVO();
		ppv= voMapper.DTOtoVO(DataUtil.mockProductPriceDTO());
		assertEquals(new Long (123456789L) ,ppv.getProductId());
		assertEquals(45.45,ppv.getPrice());
		assertEquals("USD",ppv.getCurrency());
		
	}
	

	

}
