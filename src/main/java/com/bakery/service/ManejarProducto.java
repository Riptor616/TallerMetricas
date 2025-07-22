package com.bakery.service;

import java.util.ArrayList;
import java.util.List;

import com.bakery.model.Producto;

public class ManejarProducto {
    private List<Producto> items;

    public ManejarProducto() {
        this.items = new ArrayList<>();
    }

    public void addItem(Producto item) {
        items.add(item);
    }

    public void updateItem(int id, Producto updatedItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.set(i, updatedItem);
                return;
            }
        }
    }

    public Producto getItem(int id) {
        for (Producto item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public List<Producto> getAllItems() {
        return new ArrayList<>(items);
    }
}