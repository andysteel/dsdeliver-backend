package com.gmail.andersoninfonet.dsdeliver.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Product class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "tb_product", schema = "dsdeliver")
public class Product implements Serializable {

  private static final long serialVersionUID = 9204629385894926640L;

  @Id
  @GeneratedValue(strategy  = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double price;
  private String description;
  private String imageUri;

  /**
   * <p>Constructor for Product.</p>
   */
  public Product() {
  }

  /**
   * <p>Constructor for Product.</p>
   *
   * @param id a {@link java.lang.Long} object.
   * @param name a {@link java.lang.String} object.
   * @param price a {@link java.lang.Double} object.
   * @param description a {@link java.lang.String} object.
   * @param imageUri a {@link java.lang.String} object.
   */
  public Product(Long id, String name, Double price, String description, String imageUri) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.description = description;
    this.imageUri = imageUri;
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
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <p>Getter for the field <code>price</code>.</p>
   *
   * @return a {@link java.lang.Double} object.
   */
  public Double getPrice() {
    return price;
  }

  /**
   * <p>Setter for the field <code>price</code>.</p>
   *
   * @param price a {@link java.lang.Double} object.
   */
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * <p>Getter for the field <code>imageUri</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getImageUri() {
    return imageUri;
  }

  /**
   * <p>Setter for the field <code>imageUri</code>.</p>
   *
   * @param imageUri a {@link java.lang.String} object.
   */
  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
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
    Product other = (Product) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
}
