package com.bakery.model; 

public class Galleta extends Producto {
    private boolean tieneChispas;

    public Galleta(int id, String nombre, int cantidad, int valorProduccion, int valorVenta, boolean tieneChispas) {
        super(id, nombre, cantidad, valorProduccion, valorVenta);
        this.tieneChispas = tieneChispas;
    }

    public boolean isTieneChispas() {
        return tieneChispas;
    }

    public void setTieneChispas(boolean tieneQueso) {
        this.tieneChispas = tieneQueso;
    }
}