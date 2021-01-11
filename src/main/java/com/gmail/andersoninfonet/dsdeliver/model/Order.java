package com.gmail.andersoninfonet.dsdeliver.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * <p>Order class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "tb_order", schema = "dsdeliver")
public class Order implements Serializable {

  private static final long serialVersionUID = -478333509809767342L;

  @Id
  @GeneratedValue(strategy  = GenerationType.IDENTITY)
  private Long id;
  private String address;
  private Double latitude;
  private Double longitude;
  private Instant timestamp;
  private OrderStatus status;

  @ManyToMany
  @JoinTable(name = "tb_order_product", schema = "dsdeliver",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
  private Set<Product> products = new HashSet<>();

  /**
   * <p>Constructor for Order.</p>
   */
  public Order() {
  }

  /**
   * <p>Constructor for Order.</p>
   *
   * @param id a {@link java.lang.Long} object.
   * @param address a {@link java.lang.String} object.
   * @param latitude a {@link java.lang.Double} object.
   * @param longitude a {@link java.lang.Double} object.
   * @param timestamp a {@link java.time.Instant} object.
   * @param status a {@link com.gmail.andersoninfonet.dsdeliver.model.OrderStatus} object.
   */
  public Order(Long id, String address, Double latitude,
      Double longitude, Instant timestamp, OrderStatus status) {
    this.id = id;
    this.address = address;
    this.latitude = latitude;
    this.longitude = longitude;
    this.timestamp = timestamp;
    this.status = status;
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
   * <p>getTotal.</p>
   *
   * @return a {@link java.lang.Double} object.
   */
  public Double getTotal() {
    return getProducts().stream()
                        .map(p -> p.getPrice())
                        .reduce(0.0, (total, value) -> total + value );
  }

  /**
   * <p>Getter for the field <code>products</code>.</p>
   *
   * @return a {@link java.util.Set} object.
   */
  public Set<Product> getProducts() {
    return products;
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Order other = (Order) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
}
