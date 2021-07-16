package com.unittestingjava.testingjava.application.controller;

import com.unittestingjava.testingjava.domain.entity.Cliente;
import com.unittestingjava.testingjava.domain.service.CadastrarClienteServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/v1/clientes")
public class ClienteController {


    @Autowired
    private  CadastrarClienteServices cadastrarClienteServices;


    @GetMapping()
    public Cliente getCLiente(){
        Cliente incluir = cadastrarClienteServices.cadastrar(1l,"Joao","Silva");
        return incluir;

    }
}
