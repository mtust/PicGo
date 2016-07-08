package com.tustanovskyy.service.serviceimpl;

import com.tustanovskyy.dto.PostActionDTO;
import com.tustanovskyy.entity.Post;
import com.tustanovskyy.repository.PostRepository;
import com.tustanovskyy.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Tust on 02.07.2016.
 */
public class PostServiceImpl implements PostService{


    @Autowired
    PostRepository postRepository;

    @Override
    @Transactional
    public PostActionDTO createPost(Post post) {
        postRepository.save(post);
        return new PostActionDTO();
    }
}
