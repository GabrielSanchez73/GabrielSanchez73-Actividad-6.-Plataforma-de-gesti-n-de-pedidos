
package com.pedidos.gestion.pedidos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String producto;
    private Integer cantidad;
    private String direccion;
    private String estado;
}
