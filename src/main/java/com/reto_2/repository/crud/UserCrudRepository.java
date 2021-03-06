package com.reto_2.repository.crud;

import com.reto_2.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 *
 * @author nbsc1
 * Reto 3 Ciclo 4
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    @Query("{'identification': ?0}")
    Optional<User> findByIdentificacion(final String identification);

}
