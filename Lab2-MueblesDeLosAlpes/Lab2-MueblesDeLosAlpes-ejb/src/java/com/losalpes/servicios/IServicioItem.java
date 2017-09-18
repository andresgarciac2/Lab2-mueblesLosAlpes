/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioCatalogo.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.servicios;

import com.losalpes.bos.Item;
import java.util.List;

/**
 * Contrato funcional de los servicios de items
 */
public interface IServicioItem {

    /**
     *
     * @param item
     */
    public void agregarItem(Item item);

    /**
     *
     * @param referencia
     */
    public void eliminarItem(String referencia);

    /**
     *
     * @param item
     * @return
     */
    public Item actualizarItem(Item item);

    /**
     *
     * @return
     */
    public List<Item> darItems();
}
