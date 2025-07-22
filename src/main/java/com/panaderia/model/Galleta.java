package com.panaderia.model; 

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
    
    @Override
    public String toCSV() {
        return String.format("%s,%s,%d,%d,%d,%s",
            this.getClass().getSimpleName(),
            getNombre(), getValorVenta(), getValorProduccion(), getCantidad(),
            isTieneChispas() ? "Chispas" : "-");
    }
}