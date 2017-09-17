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
import javax.faces.context.FacesContext;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;

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
     * Lista de Clientes filtrados
     */

    private List<Cliente> clientesFiltrados;
    
    /**
     * IServicioCliente
     */
    private IServicioCliente clienteService;
    /**
     * Documento d3el Cliente a Eliminar
     */
    private String numeroDocumento;
    /**
     * Documento d3el Cliente a filtrar
     */
    private String numeroDocumentoFilter = "";
    /**
     * Nombre del Cliente a Filtrar
     */
    private String nombreFilter = "";
    /**
     * Email del Cliente a Filtrar
     */
    private String email = "";
    
    public ClienteBean() {
        cliente = new Cliente();
        this.clienteService = new ServicioClienteImpl();
    }
    /**
     * Agrega un nuevo cliente al sistema
     */
    public void agregarCliente()
    {
        clienteService.agregarCliente(cliente);
        cliente=new Cliente();
    }
    
     /**
     * Elimina un cliente adel sistema
     */
    public void eliminarCliente()
    {
    DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:dataTable");
        clienteService.eliminarCliente(numeroDocumento);
        numeroDocumento = "";
    }

     /**
     * Actualiza un Cliente 
     */
    public void actualizarCliente()
    {
        clienteService.actualizarCliente(cliente);
        cliente=new Cliente();
    }
       /**
     * Devuelve una lista con los clientes del sistema Flitrados
     * @return muebles clientes del sistema
     */
    public List<Cliente> getClientesFilter()
    {
        return clienteService.darClientes(numeroDocumentoFilter, nombreFilter, email);
    }
    
    
    public List<Cliente> getClientes()
    {
        return clienteService.darClientes(numeroDocumentoFilter, nombreFilter, email);
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

    public String getNumeroDocumentoFilter() {
        return numeroDocumentoFilter;
    }

    public void setNumeroDocumentoFilter(String numeroDocumentoFilter) {
        this.numeroDocumentoFilter = numeroDocumentoFilter;
    }

    public String getNombreFilter() {
        return nombreFilter;
    }

    public void setNombreFilter(String nombreFilter) {
        this.nombreFilter = nombreFilter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cliente> getClientesFiltrados() {
        return clientesFiltrados;
    }

    public void setClientesFiltrados(List<Cliente> clientesFiltrados) {
        this.clientesFiltrados = clientesFiltrados;
    }

    
}
