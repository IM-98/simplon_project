package com.example.simplonapi.service;

import com.example.simplonapi.entity.Client;
import com.example.simplonapi.entity.Menu;
import com.example.simplonapi.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MenuService implements IMenuService{

    @Autowired
    MenuRepository menuRepository;

    @Override
    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Optional<Menu> findById(int id) {
        return menuRepository.findById(id);
    }

    @Override
    public Iterable<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public String deleteByID(int id) {
        menuRepository.deleteById(id);
        return "Menu supprimé avec succès";
    }

    @Override
    public String delete(Menu menu) {
        menuRepository.delete(menu);
        return "Menu supprimé avec succès";
    }

    @Override
    public Menu update(Menu menu) {
        Optional<Menu> menuToUpdate = menuRepository.findById(menu.getId());
        if(menuToUpdate.isEmpty()){
            return null;
        }
        Menu menu1 = menuToUpdate.get();
        menu1 = menu;
        menuRepository.save(menu1);

        return menu1;
    }
}
