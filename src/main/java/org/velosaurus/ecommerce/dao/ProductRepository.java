package org.velosaurus.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.velosaurus.ecommerce.entity.Product;

// cross-origin to accept calls from web browser scripts for this origin
@CrossOrigin("http://localhost:4200/")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
