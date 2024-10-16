package com.miguejaramillo.product_microservice.Repository;

import com.miguejaramillo.product_microservice.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductEntity, Integer> {
}
