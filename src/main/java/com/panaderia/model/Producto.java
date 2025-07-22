package com.panaderia.model;

public class Producto {
    private int id;
    private String nombre;
    private int valorVenta;
    private int valorProduccion;
    private int cantidad;

    public Producto(int id, String nombre, int cantidad, int valorProduccion, int valorVenta) {
        this.id = id;
        this.nombre = nombre;
        this.valorVenta = valorVenta;
        this.valorProduccion = valorProduccion;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getValorProduccion() {
        return valorProduccion;
    }

    public void setValorProduccion(int valorProduccion) {
        this.valorProduccion = valorProduccion;
    }

    public String toCSV() {
        return String.format("%s,%s,%d,%d,%d,-",
            this.getClass().getSimpleName(),
            nombre, valorVenta, valorProduccion, cantidad);
    }
}