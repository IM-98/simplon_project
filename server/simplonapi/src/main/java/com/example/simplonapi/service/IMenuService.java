package com.example.simplonapi.service;

import com.example.simplonapi.entity.Menu;

import java.util.Optional;

public interface IMenuService {
    Menu save(Menu menu);

    Optional<Menu> findById(int id);

    Iterable<Menu> findAll();

    String deleteByID(int id);

    String delete(Menu menu);

    Menu update( Menu menu);

}
