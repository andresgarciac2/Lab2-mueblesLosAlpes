/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Item;
import com.losalpes.bos.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afmap
 */
public class SevicioVenta {

    private List<Venta> ventas;

    private Venta venta;

    public SevicioVenta() {
        venta = new Venta();
        ventas = new ArrayList<>();
        
        ArrayList<Item> temp = new ArrayList<>();
        temp.add(new Item("f1", 10, 110));
        temp.add(new Item("f2", 10, 210));
        
        ventas.add(new Venta("Bogota",temp));
    }

    public void AgregarVenta() {
        ventas.add(venta);
    }

    public List<Venta> getVentas() {
        for (Venta item : ventas) {
            item.getFechaFin();
            item.setFechaFin();
            item.getTotal();
        }

        return ventas;
    }

}
