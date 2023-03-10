/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.service;

import entity.Fruta;
import java.util.List;

/**
 *
 * @author Pc_Estiven
 */
public interface FrutaService {

    public List<Fruta> ListarFruta();

    public Fruta CrearFruta(Fruta fruta);

    public Fruta ModificarFruta(Fruta fruta);

    public Fruta BuscarFruta(int id);

    public void EliminarFruta(int id);

    /*
    public Optional<Fruta>ListarId(int id);
    public int save (Fruta f);
    public void delete();
     */
}
