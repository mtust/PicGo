package com.tustanovskyy.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Tust on 08.06.2016.
 */

@Data
public class Location implements Serializable{

    @Id
    private String id;

    double[] position;


}
