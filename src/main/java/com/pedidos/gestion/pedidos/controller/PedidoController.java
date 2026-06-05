
package com.pedidos.gestion.pedidos.controller;

import com.pedidos.gestion.pedidos.model.Pedido;
import com.pedidos.gestion.pedidos.service.PedidoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service){
        this.service = service;
    }

    @PostMapping
    public Pedido crear(@RequestBody Pedido pedido){
        pedido.setEstado("Pendiente");
        return service.guardar(pedido);
    }

    @GetMapping
    public List<Pedido> listar(){
        return service.listar();
    }

    @PutMapping("/{id}")
    public Pedido actualizar(@PathVariable Long id,@RequestParam String estado){
        return service.actualizarEstado(id, estado);
    }
}
