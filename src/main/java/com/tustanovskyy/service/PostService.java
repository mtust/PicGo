package com.tustanovskyy.service;

import com.tustanovskyy.dto.PostActionDTO;
import com.tustanovskyy.entity.Post;

/**
 * Created by Tust on 02.07.2016.
 */
public interface PostService {

    public  PostActionDTO createPost(Post post);
}
