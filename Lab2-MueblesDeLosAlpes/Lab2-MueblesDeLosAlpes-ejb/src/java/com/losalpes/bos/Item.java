/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 *
 * @author af.mape
 */
public class Item {

    /**
     * Precio del item
     */
    private String precio;

    /**
     * Referencia del item
     */
    private String referencia;

    /**
     * Cantidad del item
     */
    private int cantidad;

    public Item() {
    }

    public Item(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Retorna el precio del item
     *
     * @return precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Asigna el precio
     *
     * @param precio
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Retorna la referencia del item
     *
     * @return referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Asigna la referencia
     *
     * @param referencia
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Retorna la cantidad del item
     *
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Asigna la cantida
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
