package com.gmail.andersoninfonet.dsdeliver.repository;

import com.gmail.andersoninfonet.dsdeliver.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>ProductRepository interface.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

  /**
   * <p>findAllByOrderByNameAsc.</p>
   *
   * @return a {@link java.util.List} object.
   */
  List<Product> findAllByOrderByNameAsc();
}
