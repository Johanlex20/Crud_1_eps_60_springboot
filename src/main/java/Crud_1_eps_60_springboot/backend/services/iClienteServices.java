package Crud_1_eps_60_springboot.backend.services;

import Crud_1_eps_60_springboot.backend.models.Cliente;

import java.util.List;

public interface iClienteServices {
    List<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    Boolean delete(Long id);

}
