package org.velosaurus.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.velosaurus.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
