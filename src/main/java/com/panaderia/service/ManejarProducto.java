package com.panaderia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.FileWriter;
import java.io.IOException;

import com.panaderia.model.Producto;

public class ManejarProducto {
    private final List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        // Validación: nombre único
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(producto.getNombre())) {
                throw new IllegalArgumentException("Ya existe un producto con ese nombre.");
            }
        }
        // Validación: el valor de producción no puede ser mayor o igual al de venta
        if (producto.getValorProduccion() >= producto.getValorVenta()) {
            throw new IllegalArgumentException("El valor de producción no puede ser mayor o igual al valor de venta.");
        }
        // Validación: cantidad debe ser positiva
        if (producto.getCantidad() <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
        }
        productos.add(producto);
    }

    public List<Producto> filtrarPorNombre(String nombre) {
        return productos.stream()
                .filter(p -> p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Producto> filtrarPorCantidad(int cantidad) {
        return productos.stream()
                .filter(p -> p.getCantidad() == cantidad)
                .collect(Collectors.toList());
    }

    public List<Producto> filtrarPorPrecio(int precioMax) {
        return productos.stream()
                .filter(p -> p.getValorVenta() <= precioMax)
                .collect(Collectors.toList());
    }

    public List<Producto> getTodos() {
        return productos;
    }
    public void generarReporte() {
    String archivo = "reporte_productos.csv";
    try (FileWriter writer = new FileWriter(archivo)) {
        // Escribir encabezado
        writer.append("Tipo,Nombre,ValorVenta,ValorProduccion,Cantidad,Extras\n");
        for (Producto item : productos) {
            writer.append(item.toCSV()).append("\n");
        }
        System.out.println("Reporte generado: " + archivo);
    } catch (IOException e) {
        System.out.println("Error al generar el reporte: " + e.getMessage());
    }
}
}