package Crud_1_eps_60_springboot.backend.repository;

import Crud_1_eps_60_springboot.backend.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iClienteRepository extends JpaRepository<Cliente, Long> {
}
