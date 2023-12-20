package Crud_1_eps_60_springboot.backend.controllers;

import Crud_1_eps_60_springboot.backend.models.Cliente;
import Crud_1_eps_60_springboot.backend.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})

public class ClienteController {

    @Autowired
    ClienteServices clienteServices;

    @GetMapping(value = "/clientes")
    public List<Cliente> findAll(){
        System.out.println("Resultado encontrado: ");
        return clienteServices.findAll();
    }

    @GetMapping(value = "/clientes/{id}")
    public Cliente findById(@PathVariable(value = "id") Long id){
        Cliente clienteEncontrado = clienteServices.findById(id);
        System.out.println("Resultado encontrado "+clienteEncontrado.getNombre());
        return clienteServices.findById(id);
    }

    @PostMapping(value = "/clientes")
    public Cliente save(@RequestBody Cliente cliente){
        System.out.println("Creado con éxito: "+cliente.getNombre());
        return clienteServices.save(cliente);
    }

    @DeleteMapping(value = "/clientes/{id}")
    public Boolean delete(@PathVariable(value = "id") Long id){
        System.out.println("Eliminado con éxito: "+clienteServices.findById(id).getNombre());
        return clienteServices.delete(id);
    }

    @PutMapping(value = "/clientes/{id}")
    public Cliente update(@PathVariable(value = "id") Long id, @RequestBody Cliente cliente){
        Cliente clienteActualizado = clienteServices.findById(id);
            if (clienteActualizado != null){
                clienteActualizado.setNombre(cliente.getNombre());
                clienteActualizado.setEmail(cliente.getEmail());
                clienteActualizado.setFecha(cliente.getFecha());
            }
        System.out.println("Actualizado con éxito: "+cliente.getNombre());
        return clienteServices.save(clienteActualizado);
    }

}
