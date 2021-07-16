package com.unittestingjava.testingjava.domain.service;

import com.unittestingjava.testingjava.domain.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServices {

    public static List<Cliente> cli = new ArrayList<>();
    static {
        ClienteServices.cli.add(new Cliente(1l,"Maxwell","Costa"));
        ClienteServices.cli.add(new Cliente(2l,"Ana","Beatriz"));
        ClienteServices.cli.add(new Cliente(3l,"Bia","Guarana"));
    }

    public Cliente cadastrar(Long id,String nome,String sobrenome){
        Cliente c1 = Cliente.builder()
                .id(id)
                .nome(nome)
                .sobreNome(sobrenome)
                .build();

        return c1;
    }

    public Cliente getById(Long id) {

            for(Cliente c :cli){
                if(c.getId().equals(id)){
                    return c;
                }
            }
            return null;
    }

    public boolean save(Cliente cliente) {
        cli.add(cliente);
        return  true;
    }

    public List<Cliente> getAll() {

     return  cli.stream().map(Cliente::new).collect(Collectors.toList());

    }
}
