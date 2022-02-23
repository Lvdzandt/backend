package com.example.rest;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IitemRepo extends JpaRepository<Item, Integer> {
}
