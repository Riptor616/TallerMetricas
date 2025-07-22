package com.bakery.model; 

public class Pan extends Producto {
    private boolean tieneQueso;

    public Pan(int id, String nombre, int cantidad, int valorProduccion, int valorVenta, boolean tieneQueso) {
        super(id, nombre, cantidad, valorProduccion, valorVenta);
        this.tieneQueso = tieneQueso;
    }

    public boolean isTieneQueso() {
        return tieneQueso;
    }

    public void setTieneQueso(boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }
}