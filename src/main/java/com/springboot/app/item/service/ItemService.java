package com.springboot.app.item.service;

import com.springboot.app.item.models.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAll();

    Item findById(Long id, Integer cantidad);

}
