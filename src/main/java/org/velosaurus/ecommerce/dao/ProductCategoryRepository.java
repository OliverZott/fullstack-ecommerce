package org.velosaurus.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.velosaurus.ecommerce.entity.ProductCategory;

// first arg: name of Json Entry
// second arg: api-url
@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
