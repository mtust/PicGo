package com.tustanovskyy.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.File;
import java.io.Serializable;

/**
 * Created by Tust on 08.06.2016.
 */

@Data
public class Post implements Serializable{

    @Id
    private String id;

    private File photo;

    private Location location;

    private String text;

    private User author;

}
