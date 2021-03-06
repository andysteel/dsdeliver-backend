package com.gmail.andersoninfonet.dsdeliver.dto;

import com.gmail.andersoninfonet.dsdeliver.model.Order;
import com.gmail.andersoninfonet.dsdeliver.model.OrderStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>OrderDto class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
public class OrderDto implements Serializable {

  private static final long serialVersionUID = -2874620129493830679L;

  private Long id;
  private String address;
  private Double latitude;
  private Double longitude;
  private Instant timestamp;
  private OrderStatus status;
  private Double total;
  private List<ProductDto> products = new ArrayList<>();

  /**
   * <p>Constructor for OrderDto.</p>
   */
  public OrderDto() {
  }

  /**
   * <p>Constructor for OrderDto.</p>
   *
   * @param id a {@link java.lang.Long} object.
   * @param address a {@link java.lang.String} object.
   * @param latitude a {@link java.lang.Double} object.
   * @param longitude a {@link java.lang.Double} object.
   * @param timestamp a {@link java.time.Instant} object.
   * @param status a {@link com.gmail.andersoninfonet.dsdeliver.model.OrderStatus} object.
   * @param total a {@link java.lang.Double} object.
   */
  public OrderDto(Long id, String address, Double latitude,
      Double longitude, Instant timestamp, OrderStatus status, Double total) {
    this.id = id;
    this.address = address;
    this.latitude = latitude;
    this.longitude = longitude;
    this.timestamp = timestamp;
    this.status = status;
    this.total = total;
  }

  /**
   * <p>Constructor for OrderDto.</p>
   *
   * @param entity a {@link com.gmail.andersoninfonet.dsdeliver.model.Order} object.
   */
  public OrderDto(Order entity) {
    this.id = entity.getId();
    this.address = entity.getAddress();
    this.latitude = entity.getLatitude();
    this.longitude = entity.getLongitude();
    this.timestamp = entity.getTimestamp();
    this.status = entity.getStatus();
    this.total = entity.getTotal();
    this.products = entity.getProducts().stream()
                    .map(ProductDto::new).collect(Collectors.toList());
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.Long} object.
   */
  public Long getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.Long} object.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * <p>Getter for the field <code>address</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getAddress() {
    return address;
  }

  /**
   * <p>Setter for the field <code>address</code>.</p>
   *
   * @param address a {@link java.lang.String} object.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * <p>Getter for the field <code>latitude</code>.</p>
   *
   * @return a {@link java.lang.Double} object.
   */
  public Double getLatitude() {
    return latitude;
  }

  /**
   * <p>Setter for the field <code>latitude</code>.</p>
   *
   * @param latitude a {@link java.lang.Double} object.
   */
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * <p>Getter for the field <code>longitude</code>.</p>
   *
   * @return a {@link java.lang.Double} object.
   */
  public Double getLongitude() {
    return longitude;
  }

  /**
   * <p>Setter for the field <code>longitude</code>.</p>
   *
   * @param longitude a {@link java.lang.Double} object.
   */
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   * <p>Getter for the field <code>timestamp</code>.</p>
   *
   * @return a {@link java.time.Instant} object.
   */
  public Instant getTimestamp() {
    return timestamp;
  }

  /**
   * <p>Setter for the field <code>timestamp</code>.</p>
   *
   * @param timestamp a {@link java.time.Instant} object.
   */
  public void setTimestamp(Instant timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.gmail.andersoninfonet.dsdeliver.model.OrderStatus} object.
   */
  public OrderStatus getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.gmail.andersoninfonet.dsdeliver.model.OrderStatus} object.
   */
  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  /**
   * <p>Getter for the field <code>total</code>.</p>
   *
   * @return a {@link java.lang.Double} object.
   */
  public Double getTotal() {
    return total;
  }

  /**
   * <p>Setter for the field <code>total</code>.</p>
   *
   * @param total a {@link java.lang.Double} object.
   */
  public void setTotal(Double total) {
    this.total = total;
  }

  /**
   * <p>Getter for the field <code>products</code>.</p>
   *
   * @return a {@link java.util.List} object.
   */
  public List<ProductDto> getProducts() {
    return products;
  }

}
