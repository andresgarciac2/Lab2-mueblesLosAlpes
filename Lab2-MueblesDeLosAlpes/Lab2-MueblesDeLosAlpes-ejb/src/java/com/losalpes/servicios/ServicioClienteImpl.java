/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author waira2
 */
public class ServicioClienteImpl implements IServicioCliente {

    /**
     * Lista de Clientes en el sistema
     */
    List<Cliente> clientes;

    public ServicioClienteImpl() {
        clientes = new ArrayList<>();
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void eliminarCliente(String numeroDocumento) {
        int index = getIndex(numeroDocumento);
        if (index != -1) {
            clientes.remove(index);
        }
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        int index = getIndex(cliente.getNumeroDocumento());
        if (index != -1) {
            clientes.set(index, cliente);
        }
        return clientes.get(index);
    }

    @Override
    public List<Cliente> darClientes(String numeroDocumento, String nombre, String email) {
        return clientes;
    }

    public int getIndex(String numeroDoc) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNumeroDocumento().equals(numeroDoc)) {
                return i;
            }
        }
        return -1;
    }

    public Cliente test(String numeroDoc) {
        Cliente result = null;

        int i = 0;
        while (i < clientes.size() && !clientes.get(i).getNumeroDocumento().equals(numeroDoc)) {
            i++;
        }

        if (i < clientes.size()) {
            result = clientes.get(i);
        }
        return result;

    }

}
