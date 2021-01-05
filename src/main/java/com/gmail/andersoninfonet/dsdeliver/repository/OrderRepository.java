package com.gmail.andersoninfonet.dsdeliver.repository;

import com.gmail.andersoninfonet.dsdeliver.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
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

}
