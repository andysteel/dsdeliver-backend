package com.gmail.andersoninfonet.dsdeliver.service;

import com.gmail.andersoninfonet.dsdeliver.model.Product;
import com.gmail.andersoninfonet.dsdeliver.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * <p>ProductService class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class ProductService {

  private ProductRepository repository;

  /**
   * <p>Constructor for ProductService.</p>
   *
   * @param repository a
   *       {@link com.gmail.andersoninfonet.dsdeliver.repository.ProductRepository} object.
   */
  public ProductService(ProductRepository repository) {
    this.repository = repository;
  }

  /**
   * <p>findAll.</p>
   *
   * @return a {@link java.util.List} object.
   */
  public List<Product> findAll() {
    return repository.findAllByOrderByNameAsc();
  }
}
