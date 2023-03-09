/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.interfaceService;

import com.demo.modelo.Fruta;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pc_Estiven
 */
public interface IFrutaService {
    public List<Fruta>Listar();
    public Optional<Fruta>ListarId(int id);
    public int save (Fruta f);
    public void delete();
}
