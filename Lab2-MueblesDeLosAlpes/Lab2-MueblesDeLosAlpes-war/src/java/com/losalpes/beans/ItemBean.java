/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CatalogoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Items de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.beans;

import com.losalpes.bos.Item;
import com.losalpes.bos.Mueble;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.IServicioItem;
import com.losalpes.servicios.ServicioCatalogoMock;
import com.losalpes.servicios.ServicioItemsImpl;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 * Managed bean encargado del catálogo de items en el sistema
 *
 */
@ManagedBean
@SessionScoped
public class ItemBean {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Representa un item del sistema
     */
    private Item item;

    /**
     * Relación con la interfaz que provee los servicios necesarios del
     * catálogo.
     */
    private IServicioCatalogo servicioCatalogo;

    /**
     *
     */
    private IServicioItem servicioItem;

    /**
     *
     * //----------------------------------------------------------- //
     * Constructor //-----------------------------------------------------------
     *
     * /**
     * Constructor de la clase principal
     */
    public ItemBean() {
        item = new Item();
        servicioCatalogo = new ServicioCatalogoMock();
        servicioItem = new ServicioItemsImpl();

        List<Mueble> muebleList = servicioCatalogo.darMuebles();

        for (Mueble mueble : muebleList) {
            servicioItem.agregarItem(new Item(mueble.getReferencia()));
        }

    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    /**
     * Devuelve el objeto item
     *
     * @return item Objeto item
     */
    public Item getItem() {
        return item;
    }

    /**
     * Modifica el objeto item
     *
     * @param item Nuevo item
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Devuelve una lista con todos los items del sistema
     *
     * @return items Items del sistema
     */
    public List<Item> getItems() {
        return servicioItem.darItems();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    /**
     * Agrega un nuevo item al sistema
     */
    public void agregarItem() {
        servicioItem.agregarItem(item);
        item = new Item();
    }

    /**
     * Actualiza un item del sistema
     */
    public void actualizarItem() {
        servicioItem.actualizarItem(item);
        item = new Item();
    }

    /**
     * Elimina un item del sistema
     */
    public void eliminarItem() {
        servicioItem.eliminarItem(item.getReferencia());
        item = new Item();
    }

    /**
     * Elimina la información del item
     */
    public void limpiar() {
        item = new Item();
    }
}
