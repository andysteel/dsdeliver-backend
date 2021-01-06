package com.gmail.andersoninfonet.dsdeliver.repository;

import java.util.List;

import com.gmail.andersoninfonet.dsdeliver.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * <p>OrderRepository interface.</p>
 *
 * @author andysteel
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

  /**
   * <p>findOrdersWithProducts.</p>
   *
   * @return a {@link java.util.List} object.
   */
  @Query("SELECT DISTINCT obj from Order obj JOIN FETCH obj.products "
        + "WHERE obj.status = 0 ORDER BY obj.timestamp ASC")
  List<Order> findOrdersWithProducts();
}
