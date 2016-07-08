package com.tustanovskyy.controller;

import com.tustanovskyy.dto.PostActionDTO;
import com.tustanovskyy.entity.Post;
import com.tustanovskyy.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.MultipartConfig;

/**
 * Created by Tust on 02.07.2016.
 */
@RestController
@Slf4j
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping(value = "/private/post/create", method = RequestMethod.POST)
    public PostActionDTO createPost(@RequestBody Post post){

        return postService.createPost(post);
    }

}
