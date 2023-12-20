package Crud_1_eps_60_springboot.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table( name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String nombre;

    @Column
    private String email;

    @Temporal(TemporalType.DATE)
    private Date fecha;

}
