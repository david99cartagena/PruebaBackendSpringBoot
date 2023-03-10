/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import entity.Fruta;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pc_Estiven
 */
public interface FrutaRepo extends CrudRepository<Fruta, Integer> {
    
}
