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
    private int precio;

    /**
     * Referencia del item
     */
    private String referencia;

    /**
     * Cantidad del item
     */
    private int cantidad;

    /**
     * Tipo del mueble
     */
    private TipoMueble tipo;

    /**
     * Nombre del Mueble
     */
    private String NombreMueble;

    /**
     * Precio total
     */
    private int PrecioTotal;

    public Item() {
    }

    public Item(String referencia, int cantidad, int precio) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Retorna el precio del item
     *
     * @return precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Asigna el precio
     *
     * @param precio
     */
    public void setPrecio(int precio) {
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

    /**
     * Retorna el tipo del mueble
     *
     * @return NombreMueble
     */
    public TipoMueble getTipo() {
        return tipo;
    }

    /**
     * Asigna el tipo
     *
     * @param tipo
     */
    public void setTipo(TipoMueble tipo) {
        this.tipo = tipo;
    }

    /**
     * retorna el nombre del mueble
     *
     * @return NombreMueble
     */
    public String getNombreMueble() {
        return NombreMueble;
    }

    /**
     * Asigna el nombre del mueble
     *
     * @param NombreMueble
     */
    public void setNombreMueble(String NombreMueble) {
        this.NombreMueble = NombreMueble;
    }

    /**
     * Retorna el precio total
     *
     * @return PrecioTotal
     */
    public int getPrecioTotal() {
        this.PrecioTotal = this.cantidad * this.precio;
        return this.PrecioTotal;
    }

}
