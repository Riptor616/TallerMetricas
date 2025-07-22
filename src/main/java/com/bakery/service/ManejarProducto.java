package com.bakery.service;

import java.io.FileWriter;
import java.io.IOException;
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

    public void generarReporte() {
        String archivo = "reporte_productos.csv";
        try (FileWriter writer = new FileWriter(archivo)) {
            // Escribir encabezado con columna Tipo
            writer.append("ID,Nombre,Cantidad,ValorProduccion,ValorVenta,Tipo\n");
            // Escribir datos de cada producto
            for (Producto item : items) {
                String tipo = "Producto";
                if (item instanceof com.bakery.model.Galleta) {
                    tipo = "Galleta";
                } else if (item instanceof com.bakery.model.Pan) {
                    tipo = "Pan";
                }
                writer.append(item.getId() + ",");
                writer.append(item.getNombre() + ",");
                writer.append(item.getCantidad() + ",");
                writer.append(item.getValorProduccion() + ",");
                writer.append(item.getValorVenta() + ",");
                writer.append(tipo + "\n");
            }
            System.out.println("Reporte generado: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al generar el reporte: " + e.getMessage());
        }
    }
}