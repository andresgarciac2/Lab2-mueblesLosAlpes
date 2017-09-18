/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author afmap
 */
public class Venta {

    private String ciudad;

    private Date fechaInicio;

    private Date fechaFin;

    private List<Item> items;

    private List<Item> itemsExterior;

    private List<Item> itemsInterior;

    private int total;

    public Venta(String ciudad, List<Item> items) {
        this.ciudad = ciudad;
        this.items = items;
        items = new ArrayList<>();
        this.fechaInicio = new Date();
    }

    public Venta() {

    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin() {
        this.fechaFin = new Date();
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsExterior() {
        return itemsExterior;
    }

    public List<Item> getItemsInterior() {
        return itemsInterior;
    }

    public int getTotal() {
        int result = 0;
        if (items != null && items.size() > 0) {

            for (Item item : items) {
                result += item.getPrecioTotal();
            }
        }

        return result;
    }

    public void GetItems() {
        itemsExterior = new ArrayList<>();
        itemsInterior = new ArrayList<>();

        for (Item item : items) {
            if (item.getTipo() == TipoMueble.Exterior) {
                itemsExterior.add(item);
            } else {
                itemsInterior.add(item);
            }
        }
    }
}
