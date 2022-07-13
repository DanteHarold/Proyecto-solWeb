package com.example.proyecto.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.proyecto.model.entity.Cliente;

public interface IClienteService {
    public void guardarCliente(Cliente cliente);
    public List<Cliente> cargarClientes();
    public Cliente buscarCliente(Long id);
    public void eliminarCliente(Long id);

    Page<Cliente> getAll(Pageable pageable);
    
    
}
