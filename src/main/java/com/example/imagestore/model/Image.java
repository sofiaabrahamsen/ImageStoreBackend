package com.example.imagestore.model;

import lombok.Data;

import java.util.Date;
@Data // gets getter, setter, constructor for all fields. and a toString method also.
public class Image {
    Integer id;
    Long size;
    String user;
    String name;
    String title;
    String description;
    String image;
    Date created;
}
