package com.tustanovskyy.repository;

import com.tustanovskyy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Tust on 08.06.2016.
 */
@Repository
public interface UserRepository extends MongoRepository<User, Long> {

    @Query
    public Optional<User> findOneByEmail(String email);



}
