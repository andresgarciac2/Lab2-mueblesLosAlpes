/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author af.mape
 */
public class ServicioItemsImpl implements IServicioItem {

    /**
     * Arreglo con items del sistema
     */
    private ArrayList<Item> items;

    @Override
    public void agregarItem(Item item) {
        if (item != null && getIndex(item.getReferencia()) == -1) {
            items.add(item);
        }
    }

    @Override
    public void eliminarItem(String referencia) {
        int index = getIndex(referencia);
        if (index != -1) {
            items.remove(index);
        }
    }

    @Override
    public Item actualizarItem(Item item) {
        Item result = null;
        int index = getIndex(item.getReferencia());
        if (index != -1) {
            items.set(index, item);
            result = items.get(index);
        }
        return result;
    }

    @Override
    public List<Item> darItems() {
        return items;
    }

    private int getIndex(String referencia) {
        int result = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getReferencia().equalsIgnoreCase(referencia)) {
                result = i;
            }
        }
        return result;
    }

}
