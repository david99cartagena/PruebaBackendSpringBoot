/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.interfaces;

import com.demo.modelo.Pedido;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pc_Estiven
 */
public interface IPedido extends CrudRepository<Pedido, Integer> {

}
