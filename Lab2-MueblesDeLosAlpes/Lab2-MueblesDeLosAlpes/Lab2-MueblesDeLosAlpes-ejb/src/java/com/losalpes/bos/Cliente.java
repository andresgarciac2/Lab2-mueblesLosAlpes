/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 *
 * @author waira2
 */
public class Cliente {
    
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * numeroDocumento.
     */
    private String numeroDocumento;
   
    /**
     * tipoDocumento.
     */
    private String tipoDocumento;
    
     /**
     * nombre.
     */
    private String nombre;
 
    /**
     * telefono.
     */
    private String telefono;
    
    /**
     * Celular.
     */
    private String celular;
    
    /**
     * direccion.
     */
    private String direccion;
    
     /**
     * ciudad.
     */
    private String ciudad;
    
    /**
     * departamento.
     */
    private String departamento;
    
    /**
     * pais.
     */
    private String pais;
    
    /**
     * profesion.
     */
    private String profesion;
    
     /**
     * email.
     */
    private String email;

    /**
     * Constructor por defecto
     */
    public Cliente (){
            
     }
    
    /**
     * 
     * Constructor con todos los parametros
     * 
     * @param numeroDocumento
     * @param tipoDocumento
     * @param nombre
     * @param telefono
     * @param celular
     * @param direccion
     * @param ciudad
     * @param departamento
     * @param pais
     * @param profesion
     * @param email 
     */
    public Cliente(String numeroDocumento, String tipoDocumento, String nombre, String telefono, String celular, String direccion, String ciudad, String departamento, String pais, String profesion, String email) {
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.profesion = profesion;
        this.email = email;
    }
    
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
