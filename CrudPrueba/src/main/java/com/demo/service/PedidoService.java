/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.service;

import entity.Pedido;
import java.util.List;

/**
 *
 * @author Pc_Estiven
 */
public interface PedidoService {

    public List<Pedido> ListarPedido();

    public Pedido CrearPedido(Pedido pedido);

    public Pedido ModificarPedido(Pedido pedido);

    public Pedido BuscarPedido(int id);

    public void EliminarPedido(int id);

    /*
    public List<Pedido> Listar();
    public Optional<Pedido> ListarId(int id);
    public int save(Pedido p);
    public void delete();
     */
}
