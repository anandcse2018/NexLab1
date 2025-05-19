package com.NexLab1.services;

import com.NexLab1.domains.Product;

import java.util.List;

public interface InventoryService {

    public Product create(Product product);

    public List<Product> get();

    public Product getOne(Long id);
}
