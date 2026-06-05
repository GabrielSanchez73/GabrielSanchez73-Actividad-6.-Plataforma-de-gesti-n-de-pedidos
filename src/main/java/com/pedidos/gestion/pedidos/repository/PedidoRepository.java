
package com.pedidos.gestion.pedidos.repository;

import com.pedidos.gestion.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
