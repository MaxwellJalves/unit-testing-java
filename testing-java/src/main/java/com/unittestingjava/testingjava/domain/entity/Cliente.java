package com.unittestingjava.testingjava.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private Long id;
    private String nome;
    private String sobreNome;
}
