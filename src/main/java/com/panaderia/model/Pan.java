package com.panaderia.model; 

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
    
    @Override
    public String toCSV() {
        return String.format("%s,%s,%d,%d,%d,%s",
            this.getClass().getSimpleName(),
            getNombre(), getValorVenta(), getValorProduccion(), getCantidad(),
            isTieneQueso() ? "Queso" : "-");
    }
}