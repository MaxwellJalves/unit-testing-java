package com.unittestingjava.testingjava.domain.service;

import com.unittestingjava.testingjava.domain.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class CadastrarClienteServices {

    public Cliente cadastrar(Long id,String nome,String sobrenome){
        Cliente c1 = Cliente.builder()
                .id(id)
                .nome(nome)
                .sobreNome(sobrenome)
                .build();

        return c1;
    }
    
}
