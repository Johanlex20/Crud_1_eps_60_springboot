package Crud_1_eps_60_springboot.backend.services;

import Crud_1_eps_60_springboot.backend.models.Cliente;
import Crud_1_eps_60_springboot.backend.repository.iClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices implements iClienteServices{

    @Autowired
    iClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Boolean delete(Long id) {
        clienteRepository.deleteById(id);
        return true;
    }
}
