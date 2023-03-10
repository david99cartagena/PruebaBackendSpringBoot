/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.controler;

import com.demo.service.impl.FrutaServiceImpl;
import entity.Fruta;
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
@RequestMapping("FrutaRepo")
public class ControladorFruta {

    @Autowired
    private FrutaServiceImpl impl;

    @GetMapping
    @RequestMapping(value = "ListarFrutas", method = RequestMethod.GET)
    public ResponseEntity<?> ListarFrutas() {
        List<Fruta> listaFruta = this.impl.ListarFruta();
        return ResponseEntity.ok(listaFruta);
    }

    @PostMapping
    @RequestMapping(value = "CrearFrutas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearFrutas(@RequestBody Fruta fruta) {
        Fruta FrutaCreada = this.impl.CrearFruta(fruta);
        return ResponseEntity.status(HttpStatus.CREATED).body(FrutaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarFrutas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarFrutas(@RequestBody Fruta fruta) {
        Fruta FrutaModificada = this.impl.ModificarFruta(fruta);
        return ResponseEntity.status(HttpStatus.CREATED).body(FrutaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarFruta/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarFruta(@PathVariable int id) {
        Fruta fruta = this.impl.BuscarFruta(id);
        return ResponseEntity.ok(fruta);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarFruta/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarFruta(@PathVariable int id) {
        this.impl.EliminarFruta(id);
        return ResponseEntity.ok().build();
    }
}
