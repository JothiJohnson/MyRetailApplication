package com.jothi.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.client.RestTemplate;

import com.jothi.example.exception.ResourceNotFoundException;
import com.jothi.example.service.ProductService;
import com.jothi.example.test.util.DataUtil;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.jothi.example.Application.class)
@AutoConfigureMockMvc
public class ProductControllerTest {

 @Autowired
 private MockMvc mockMvc;
 
 @MockBean
 ProductService productService;
 
 @MockBean
 RestTemplate restTemplate;
 
 @Before
 public void init() throws Exception {
	 @SuppressWarnings("unchecked")
	 ResponseEntity<String> responseEntitiy = Mockito.mock(ResponseEntity.class);
	 Mockito.when(restTemplate.exchange(Mockito.anyString(),Mockito.eq(HttpMethod.GET),
			 Mockito.any(HttpEntity.class),Mockito.eq(String.class))).thenReturn(responseEntitiy);
	 Mockito.when(responseEntitiy.getStatusCode()).thenReturn(HttpStatus.OK)
	 ;
 }
 
 @Test
 public void testgetProduct() throws Exception
 {
	 final String expectedResult ="{\"product\":{\"productId\":123456789,\"productName\":\"Testing\"},\"price\":{\"price\":45.45,\"currency\":\"USD\"}}";
	 Mockito.when(productService.getProduct(123456789L)).thenReturn(DataUtil.mockProductPriceDTO());
	 final RequestBuilder requestBuilder = MockMvcRequestBuilders
			 .get("http://localhost:8090/v1/products/123456789")
			 .accept(MediaType.APPLICATION_JSON);
	 final MvcResult result = mockMvc.perform(requestBuilder).andReturn();
	 assertNotNull(result);
	 MockHttpServletResponse response = result.getResponse();
	 assertEquals(expectedResult,response.getContentAsString());
 }
 @Test
 public void testgetProductInvalidnumber() throws Exception
 {
	 final String expectedResult ="{\"detail\":\"Product Id can only be a number\",\"message\":\"For input string: \\\"123456789a\\\"\"}";
	 Mockito.when(productService.getProduct(123456789L)).thenThrow(ResourceNotFoundException.class);
	 final RequestBuilder requestBuilder = MockMvcRequestBuilders
			 .get("http://localhost:8090/v1/products/123456789a")
			 .accept(MediaType.APPLICATION_JSON);
	 final MvcResult result = mockMvc.perform(requestBuilder).andReturn();
	 MockHttpServletResponse response = result.getResponse();
	 assertEquals(expectedResult,response.getContentAsString());
 }
 
 @Test
 public void testcreateProduct() throws Exception
 {
	 final String contentSample ="{\"product\":{\"productId\":123456789,\"productName\":\"Testing\"},\"price\":{\"price\":45.45,\"currency\":\"USD\"}}";
	 final RequestBuilder requestBuilder = MockMvcRequestBuilders
			 .post("http://localhost:8090/v1/products/")
			 .accept(MediaType.APPLICATION_JSON)
			 .contentType(MediaType.APPLICATION_JSON)
			 .content(contentSample);
	 final MvcResult result = mockMvc.perform(requestBuilder).andReturn();
	 assertNotNull(result);
	 MockHttpServletResponse response = result.getResponse();
	 assertEquals(HttpStatus.CREATED.value(),response.getStatus());
 }
}
