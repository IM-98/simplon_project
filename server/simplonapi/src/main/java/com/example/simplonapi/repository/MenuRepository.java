package com.example.simplonapi.repository;

import com.example.simplonapi.entity.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends CrudRepository<Menu,Integer> {
}
