/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.interfaceService;

import com.demo.modelo.Pedido;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pc_Estiven
 */
public interface IPedidoService {

    public List<Pedido> Listar();
    public Optional<Pedido> ListarId(int id);
    public int save(Pedido p);
    public void delete();
}
