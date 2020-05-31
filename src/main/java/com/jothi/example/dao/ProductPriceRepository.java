package com.jothi.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jothi.example.domain.ProductPriceVO;


@Repository
public interface ProductPriceRepository extends CrudRepository<ProductPriceVO, String>{

}
