package com.tustanovskyy.repository;

import com.tustanovskyy.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tust on 08.06.2016.
 */

@Repository
public interface PostRepository extends MongoRepository<Post, Long>{

    @Query
    public Post findPostById(Long id);

}
