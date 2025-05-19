package com.NexLab1.repositories;

import com.NexLab1.domains.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Product, Long> {
}
