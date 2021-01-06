package com.gmail.andersoninfonet.dsdeliver.service;

import com.gmail.andersoninfonet.dsdeliver.dto.OrderDto;
import com.gmail.andersoninfonet.dsdeliver.model.Order;
import com.gmail.andersoninfonet.dsdeliver.model.OrderStatus;
import com.gmail.andersoninfonet.dsdeliver.model.Product;
import com.gmail.andersoninfonet.dsdeliver.repository.OrderRepository;
import com.gmail.andersoninfonet.dsdeliver.repository.ProductRepository;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>OrderService class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
@Transactional
public class OrderService {

  private OrderRepository repository;
  private ProductRepository productRepository;

  /**
   * <p>Constructor for OrderService.</p>
   *
   * @param repository a
   *       {@link com.gmail.andersoninfonet.dsdeliver.repository.OrderRepository} object.
   * @param productRepository a
   *      {@link com.gmail.andersoninfonet.dsdeliver.repository.ProductRepository} object.
   */
  public OrderService(OrderRepository repository,
                      ProductRepository productRepository) {
    this.repository = repository;
    this.productRepository = productRepository;
  }

  /**
   * <p>findAll.</p>
   *
   * @return a {@link java.util.List} object.
   */
  public List<OrderDto> findAll() {
    return repository.findOrdersWithProducts().stream()
                      .map(OrderDto::new).collect(Collectors.toList());
  }

  /**
   * <p>save.</p>
   *
   * @param dto a {@link com.gmail.andersoninfonet.dsdeliver.dto.OrderDto} object.
   * @return a {@link com.gmail.andersoninfonet.dsdeliver.dto.OrderDto} object.
   */
  public OrderDto save(OrderDto dto) {
    final Order order = new Order(null, dto.getAddress(), dto.getLatitude(),
                  dto.getLongitude(), Instant.now(), OrderStatus.PENDING);
    dto.getProducts().forEach(p -> {
      Product product = productRepository.getOne(p.getId());
      order.getProducts().add(product);
    });
    Order orderSaved = repository.save(order);
    return new OrderDto(orderSaved);
  }

  /**
   * <p>setDelivered.</p>
   *
   * @param id a {@link java.lang.Long} object.
   * @return a {@link com.gmail.andersoninfonet.dsdeliver.dto.OrderDto} object.
   */
  public OrderDto setDelivered(Long id) {
    Order order = repository.getOne(id);
    order.setStatus(OrderStatus.DELIVERED);
    Order orderUpdated = repository.save(order);
    return new OrderDto(orderUpdated);
  }
}
