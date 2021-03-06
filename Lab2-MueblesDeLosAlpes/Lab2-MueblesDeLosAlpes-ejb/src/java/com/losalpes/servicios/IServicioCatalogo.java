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

import com.losalpes.bos.Cliente;
import com.losalpes.bos.Mueble;
import java.util.List;

/**
 * Contrato funcional de los servicios que se le prestan al catálogo
 */
public interface IServicioCatalogo {

    /**
     * Agrega un mueble al sistema
     *
     * @param mueble Nuevo mueble
     */
    public void agregarMueble(Mueble mueble);

    /**
     * Devuelve todos los muebles del sistema
     *
     * @return muebles Lista de muebles
     */
    public List<Mueble> darMuebles();

    /**
     * Elimina un mueble del sistema
     *
     * @param referencia identificador unico
     */
    public void eliminarMueble(String referencia);

    /**
     * Actualiza un mueble en el sistema
     *
     * @param mueble mueble para actualizar
     * @return instancia que representa al mueble actualizado
     */
    public Mueble actualizarMueble(Mueble mueble);

}
