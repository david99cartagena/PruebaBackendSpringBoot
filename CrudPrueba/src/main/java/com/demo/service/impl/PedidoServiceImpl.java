/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.service.impl;

import entity.Pedido;
import java.util.List;
import org.springframework.stereotype.Service;
import com.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import repository.PedidoRepo;

/**
 *
 * @author Pc_Estiven
 */
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepo repo;

    @Override
    public List<Pedido> ListarPedido() {
        return (List<Pedido>) this.repo.findAll();
    }

    @Override
    public Pedido CrearPedido(Pedido pedido) {

        pedido.setValortotal(pedido.getValortotal());
        return this.repo.save(pedido);
    }

    @Override
    public Pedido ModificarPedido(Pedido Pedido) {
        return this.repo.save(Pedido);
    }

    @Override
    public Pedido BuscarPedido(int id) {
        this.repo.findById(id).get();
        return null;
    }

    @Override
    public void EliminarPedido(int id) {
        this.repo.deleteById(id);
    }

}
