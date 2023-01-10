package com.example.simplonapi.controller;

import com.example.simplonapi.entity.Menu;
import com.example.simplonapi.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/menus")
public class MenuController {
    @Autowired
    IMenuService iMenuService;


    @PostMapping("/new")
    public Menu addNewMenu(@RequestBody Menu menu){
        return iMenuService.save(menu);
    }
    @GetMapping("")
    public Iterable<Menu> getMenu(){
        return iMenuService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Menu> getMenuById(@PathVariable("id") int id){
        return iMenuService.findById(id);
    }

    @PutMapping("/update")
    public Menu updateMenu(@RequestBody Menu menu){
        return iMenuService.update(menu);
    }

    @DeleteMapping("/delete")
    public String deleteMenu(@RequestBody Menu menu){
        return iMenuService.delete(menu);
    }

    @DeleteMapping("/delete/id")
    public String deleteMenuId(int id){
        return iMenuService.deleteByID(id);
    }
}
