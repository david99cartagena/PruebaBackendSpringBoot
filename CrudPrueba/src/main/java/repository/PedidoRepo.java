/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import entity.Pedido;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pc_Estiven
 */
public interface PedidoRepo extends CrudRepository<Pedido, Integer> {

}
