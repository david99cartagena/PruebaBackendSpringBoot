/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.demo.interfaceService.IFrutaService;
import com.demo.modelo.Fruta;


/**
 *
 * @author Pc_Estiven
 */
@Controller
@RequestMapping
public class ControladorFruta {

    @Autowired
    private IFrutaService service;
    
    public String listar(Model model);
        List<Fruta>frutas=service.Listar();
        model.addAttribute("frutas", frutas);
        return "index";
    }

}
