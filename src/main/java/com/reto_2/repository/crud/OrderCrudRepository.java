package com.reto_2.repository.crud;

import com.reto_2.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 *
 * @author nbsc1
 * Reto 3 Ciclo 4
 */

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {

    @Query("{'salesMan.identification': ?0}")
    List<Order> findByIdentification(final String identification);

    @Query("{'salesMan.zone':?0}")
    public List<Order> findByZone(String zona);

    @Query("{'salesMan.status':?0}")
    public List<Order> findByStatus(String status);


}
