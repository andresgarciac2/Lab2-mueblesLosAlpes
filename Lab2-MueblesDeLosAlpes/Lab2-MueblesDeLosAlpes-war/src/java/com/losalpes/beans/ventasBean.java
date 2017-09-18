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
import com.losalpes.bos.Venta;
import com.losalpes.servicios.SevicioVenta;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Managed bean encargado del catálogo de items en el sistema
 *
 */
@ManagedBean
@SessionScoped
public class ventasBean {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Representa un item del sistema
     */
    private SevicioVenta sevicioVenta;

    private Venta venta;

    /**
     *
     * //----------------------------------------------------------- //
     * Constructor //-----------------------------------------------------------
     *
     * /**
     * Constructor de la clase principal
     */
    public ventasBean() {
        venta = new Venta();
        sevicioVenta = new SevicioVenta();
    }

    /**
     * Devuelve una lista de ventas del sistema
     *
     * @return muebles Muebles del sistema
     */
    public List<Venta> getVentas() {
        return this.sevicioVenta.getVentas();
    }

    public List<Item> getItemsExterior() {
        return venta.getItemsExterior();
    }
    
    public List<Item> getItemsInterior() {
        return venta.getItemsInterior();
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        venta.GetItems();
        this.venta = venta;
    }

}
