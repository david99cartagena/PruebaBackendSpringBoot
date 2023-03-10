/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.service.impl;

import entity.Fruta;
import java.util.List;
import org.springframework.stereotype.Service;
import com.demo.service.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import repository.FrutaRepo;

/**
 *
 * @author Pc_Estiven
 */
@Service
public class FrutaServiceImpl implements FrutaService {

    @Autowired
    private FrutaRepo repo;

    @Override
    public List<Fruta> ListarFruta() {
        return (List<Fruta>) this.repo.findAll();
    }

    @Override
    public Fruta CrearFruta(Fruta fruta) {
        fruta.setTipo(fruta.getTipo());
        return this.repo.save(fruta);
    }

    @Override
    public Fruta ModificarFruta(Fruta fruta) {
        return this.repo.save(fruta);
    }

    @Override
    public Fruta BuscarFruta(int id) {
        this.repo.findById(id).get();
        return null;
    }

    @Override
    public void EliminarFruta(int id) {
        this.repo.deleteById(id);
    }

}
