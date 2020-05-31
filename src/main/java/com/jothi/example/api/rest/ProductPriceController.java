package com.jothi.example.api.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import com.jothi.example.DTO.ProductPriceDTO;
import com.jothi.example.exception.DataFormatException;
import com.jothi.example.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Demonstrates how to set up RESTful API endpoints using Spring MVC
 */

@RestController
@RequestMapping(value = "/v1/products")
@Api(tags = {"products"})
public class ProductPriceController extends AbstractRestHandler {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a Product resource.", notes = "Returns the URL of the new resource in the Location header.")
    public void createProduct(@RequestBody ProductPriceDTO product,
                                 HttpServletRequest request, HttpServletResponse response) {
    	this.productService.createProduct(product);

    }

    

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get a single product.", notes = "You have to provide a valid product ID.")
    public
    @ResponseBody
    ProductPriceDTO getProduct(@ApiParam(value = "The ID of the product.", required = true)
                             @PathVariable("id") Long id,
                             HttpServletRequest request, HttpServletResponse response) {
        ProductPriceDTO product = null;
		try {
			product = this.productService.getProduct(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		checkResourceFound(product);
        return product;
    }




}
