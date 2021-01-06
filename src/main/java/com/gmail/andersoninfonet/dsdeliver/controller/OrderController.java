package com.gmail.andersoninfonet.dsdeliver.controller;

import com.gmail.andersoninfonet.dsdeliver.dto.OrderDto;
import com.gmail.andersoninfonet.dsdeliver.service.OrderService;

import java.net.URI;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * <p>OrderController class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

  private OrderService service;

  /**
   * <p>Constructor for OrderController.</p>
   *
   * @param service a {@link com.gmail.andersoninfonet.dsdeliver.service.OrderService} object.
   */
  public OrderController(OrderService service) {
    this.service = service;
  }

  /**
   * <p>findAll.</p>
   *
   * @return a {@link org.springframework.http.ResponseEntity} object.
   */
  @GetMapping
  public ResponseEntity<List<OrderDto>> findAll() {
    return ResponseEntity.ok(this.service.findAll());
  }

  /**
   * <p>insert.</p>
   *
   * @param dto a {@link com.gmail.andersoninfonet.dsdeliver.dto.OrderDto} object.
   * @return a {@link org.springframework.http.ResponseEntity} object.
   */
  @PostMapping
  public ResponseEntity<OrderDto> insert(@RequestBody OrderDto dto) {
    OrderDto dtoSaved = this.service.save(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
              .buildAndExpand(dtoSaved.getId()).toUri();
    return ResponseEntity.created(uri).body(dtoSaved);
  }

  /**
   * <p>setDelivered.</p>
   *
   * @param id a {@link java.lang.Long} object.
   * @return a {@link org.springframework.http.ResponseEntity} object.
   */
  @PatchMapping("/{id}/delivered")
  public ResponseEntity<OrderDto> setDelivered(@PathVariable Long id) {
    OrderDto orderUpdated = this.service.setDelivered(id);
    return ResponseEntity.ok(orderUpdated);
  }
}
