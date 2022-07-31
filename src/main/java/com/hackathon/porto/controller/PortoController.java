package com.hackathon.porto.controller;

import com.hackathon.porto.model.DadosViagem;
import com.hackathon.porto.service.PortoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping
public class PortoController {

    private PortoService service;

    @Autowired
    public PortoController(PortoService service) {
        this.service = service;
    }

    @GetMapping
    public Object buscaNavioPorId(@RequestParam Long id){
        Response dadosViagem = service.buscaViagemPorId(id);
      return dadosViagem;
    }
}
