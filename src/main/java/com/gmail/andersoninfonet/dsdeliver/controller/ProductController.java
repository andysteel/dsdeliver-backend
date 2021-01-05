package com.gmail.andersoninfonet.dsdeliver.controller;

import com.gmail.andersoninfonet.dsdeliver.model.Product;
import com.gmail.andersoninfonet.dsdeliver.service.ProductService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>ProductController class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
@RequestMapping("/products")
public class ProductController {

  private ProductService service;

  /**
   * <p>Constructor for ProductController.</p>
   *
   * @param service a {@link com.gmail.andersoninfonet.dsdeliver.service.ProductService} object.
   */
  public ProductController(ProductService service) {
    this.service = service;
  }

  /**
   * <p>findAll.</p>
   *
   * @return a {@link org.springframework.http.ResponseEntity} object.
   */
  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
