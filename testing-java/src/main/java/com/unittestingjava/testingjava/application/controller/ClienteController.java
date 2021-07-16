package com.unittestingjava.testingjava.application.controller;

import com.unittestingjava.testingjava.domain.entity.Cliente;
import com.unittestingjava.testingjava.domain.service.ClienteServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/v1/clientes")
public class ClienteController {


    @Autowired
    private ClienteServices clienteServices;



    @GetMapping()
    public ResponseEntity<List<Cliente>> getCLiente(){
        List<Cliente> response = clienteServices.getAll();
        return ResponseEntity.ok(response);

    }

    @GetMapping(path="{id}")
    public ResponseEntity<Cliente> getById(@PathVariable Long id){
        Cliente c = clienteServices.getById(id);

        if(c != null){
            return  ResponseEntity.ok().body(c);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Cliente cliente){
        boolean retorno = clienteServices.save(cliente);
        String response = retorno==true?"Registro criado com sucesso" : "Erro ao inserir os dados";
        return ResponseEntity.ok(response);

    }
}
