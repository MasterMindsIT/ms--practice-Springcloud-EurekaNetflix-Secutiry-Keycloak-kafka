package com.ms_products.services;

import com.ms_products.dtos.ProductRequest;
import com.ms_products.dtos.ProductResponse;

import java.util.List;

public interface IProduct {
    public void addProduct(ProductRequest productRequest);
    public List<ProductResponse> getAllProducts();

}
