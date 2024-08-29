package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    void deleteAllByDescription(String description);

    @Modifying(flushAutomatically=true)
    @Query(value="delete from Product pp where pp in (select p from Product p INNER JOIN Company c on p.company=c where p.description=?1)")
    void deleteProductsByDescription(String desc);
}
