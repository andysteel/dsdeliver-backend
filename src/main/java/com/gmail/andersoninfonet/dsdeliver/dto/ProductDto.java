package com.gmail.andersoninfonet.dsdeliver.dto;

import com.gmail.andersoninfonet.dsdeliver.model.Product;
import java.io.Serializable;

/**
 * <p>ProductDto class.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
public class ProductDto implements Serializable {

  private static final long serialVersionUID = 8914658406307039854L;

  private Long id;
  private String name;
  private Double price;
  private String description;
  private String imageUri;

  /**
   * <p>Constructor for ProductDto.</p>
   */
  public ProductDto() {
  }

  /**
   * <p>Constructor for ProductDto.</p>
   *
   * @param id a {@link java.lang.Long} object.
   * @param name a {@link java.lang.String} object.
   * @param price a {@link java.lang.Double} object.
   * @param description a {@link java.lang.String} object.
   * @param imageUri a {@link java.lang.String} object.
   */
  public ProductDto(Long id, String name, Double price, String description, String imageUri) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.description = description;
    this.imageUri = imageUri;
  }

  /**
   * <p>Constructor for ProductDto.</p>
   *
   * @param entity a {@link com.gmail.andersoninfonet.dsdeliver.model.Product} object.
   */
  public ProductDto(Product entity) {
    this.id = entity.getId();
    this.name = entity.getName();
    this.price = entity.getPrice();
    this.description = entity.getDescription();
    this.imageUri = entity.getImageUri();
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
}
