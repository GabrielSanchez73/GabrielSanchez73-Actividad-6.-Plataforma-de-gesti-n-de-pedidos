
package com.pedidos.gestion.pedidos.service;

import com.pedidos.gestion.pedidos.model.Pedido;
import com.pedidos.gestion.pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository){
        this.repository = repository;
    }

    public Pedido guardar(Pedido pedido){
        return repository.save(pedido);
    }

    public List<Pedido> listar(){
        return repository.findAll();
    }

    public Pedido actualizarEstado(Long id, String estado){
        Pedido pedido = repository.findById(id).orElse(null);
        if(pedido != null){
            pedido.setEstado(estado);
            return repository.save(pedido);
        }
        return null;
    }
}
