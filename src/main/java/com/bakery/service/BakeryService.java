package com.bakery.service;

import com.bakery.model.BakeryItem;
import java.util.ArrayList;
import java.util.List;

public class BakeryService {
    private List<BakeryItem> items;

    public BakeryService() {
        this.items = new ArrayList<>();
    }

    public void addItem(BakeryItem item) {
        items.add(item);
    }

    public void updateItem(int id, BakeryItem updatedItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.set(i, updatedItem);
                return;
            }
        }
    }

    public BakeryItem getItem(int id) {
        for (BakeryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public List<BakeryItem> getAllItems() {
        return new ArrayList<>(items);
    }
}