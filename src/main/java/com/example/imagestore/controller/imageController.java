package com.example.imagestore.controller;

import com.example.imagestore.model.Image;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin //alle har access
@RestController
@RequestMapping("/api/image")

public class imageController {
int counter;
List<Image> images;

public ImageController() {
    images = new ArrayList<>();
}

@GetMapping() //getmetode til at hente alle billeder
    public ResponseEntity<List<Image>> findAll(){
    System.out.println("Found image: " + images.size());
    return ResponseEntity.ok().body(images);
}

@GetMapping("/byuser/{user}") //getmetode til at få hentet ét specifik billede ud fra user
    public ResponseEntity<List<Image>> findByUser(@PathVariable String user){
    List<Image> userImage = images.stream().filter(element -> element.getUser().equals(user)).collect(Collectors.toList());
    System.out.println("Found images:" + userImage.size());
    return ResponseEntity.ok().body(userImage);
}
}
