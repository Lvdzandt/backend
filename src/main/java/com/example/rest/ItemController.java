package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {

    private final IitemRepo repo;

    public ItemController(IitemRepo repo){
        this.repo = repo;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/hw")
    public String hw(){
        return "Hello World";
    }


    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/")
    public List<Item> all(){
        return repo.findAll();
    }


    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/")
    public Item newItem(@RequestBody Item item){
        return repo.save(item);
    }



}
