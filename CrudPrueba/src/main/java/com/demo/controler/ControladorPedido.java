/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.controler;

import com.demo.service.impl.PedidoServiceImpl;
import entity.Pedido;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Pc_Estiven
 */
@RestController
@RequestMapping("PedidoRepo")
public class ControladorPedido {

    @Autowired
    private PedidoServiceImpl impl;

    @GetMapping
    @RequestMapping(value = "ListarPedidos", method = RequestMethod.GET)
    public ResponseEntity<?> ListarPedidos() {
        List<Pedido> listaPedido = this.impl.ListarPedido();
        return ResponseEntity.ok(listaPedido);
    }

    @PostMapping
    @RequestMapping(value = "CrearPedidos", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPedidos(@RequestBody Pedido pedido) {
        Pedido PedidoCreado = this.impl.CrearPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(PedidoCreado);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPedidos", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPedidos(@RequestBody Pedido pedido) {
        Pedido FrutaModificada = this.impl.ModificarPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(FrutaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPedido/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPedido(@PathVariable int id) {
        Pedido pedido = this.impl.BuscarPedido(id);
        return ResponseEntity.ok(pedido);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPedido/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPedido(@PathVariable int id) {
        this.impl.EliminarPedido(id);
        return ResponseEntity.ok().build();
    }
}
