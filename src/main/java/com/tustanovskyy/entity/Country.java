package com.tustanovskyy.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Tust on 08.06.2016.
 */

@Data
public class Country implements Serializable{

    @Id
    private String id;
    private String name;

    private List<User> users;

    private List<Post> posts;

   }
