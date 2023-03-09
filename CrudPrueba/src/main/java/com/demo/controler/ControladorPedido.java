/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.demo.interfaceService.IPedidoService;
import com.demo.interfaces.IPedido;

/**
 *
 * @author Pc_Estiven
 */
@Controller
public class ControladorPedido {

    @Autowired
    private IPedidoService service;

}
