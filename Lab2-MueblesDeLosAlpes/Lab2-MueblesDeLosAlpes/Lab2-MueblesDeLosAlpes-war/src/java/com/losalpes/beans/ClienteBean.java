/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.servicios.IServicioCliente;
import com.losalpes.servicios.ServicioClienteImpl;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Managed bean encargado de CRUD de Clientes
 * 
 */
@ManagedBean
@SessionScoped
public class ClienteBean {
    
    /**
     * Cliente bean attr
     */
    private Cliente cliente;
    
    /**
     * IServicioCliente
     */
    private IServicioCliente clienteService;
    
    /**
     * numero-Doc 
     */
    private String numeroDocumento;

    public ClienteBean() {
        this.clienteService = new ServicioClienteImpl();
        cliente = new Cliente();
    }
    /**
     * Agrega un nuevo cliente al sistema
     */
    public void agregarCliente()
    {
        clienteService.agregarCliente(cliente);
        cliente=new Cliente();
    }
    
    public void eliminarCliente(){
        clienteService.eliminarCliente(numeroDocumento);
        numeroDocumento = "";
    }
    
       /**
     * Devuelve una lista con los clientes del sistema Flitrados
     * @return muebles clientes del sistema
     */
    public List<Cliente> getClientes()
    {
        return clienteService.darClientes("", "", "");
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    

}
