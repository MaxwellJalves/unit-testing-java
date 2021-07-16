package com.unittestingjava.testingjava;

import com.unittestingjava.testingjava.application.controller.ClienteController;
import com.unittestingjava.testingjava.domain.entity.Cliente;
import com.unittestingjava.testingjava.domain.service.ClienteServices;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//---------------------
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

@WebMvcTest
public class TestingClienteController {

    @Autowired
    private ClienteController controller;

    @MockBean
    private ClienteServices clienteServices;

    @BeforeEach
    public void setup(){
        standaloneSetup(this.controller);
    }

    @Test
    public void deveretornarSucesso_quandoexitirdados(){

        Mockito.when(this.clienteServices.getById(1L)).thenReturn(new Cliente(1L,"MAXWELL","COSTA"));

        given()
          .accept(ContentType.JSON)
        .when()
                .get("/app/v1/clientes/{id}",1L)
        .then()
                .statusCode(HttpStatus.OK.value());
    }

    @Test
    public void deveRetornarNaoEncontrato_quandoBuscarIdInexiste(){
        Mockito.when(this.clienteServices.getById(10l))
                .thenReturn(null);
    //dado
        given()
            .accept(ContentType.JSON)
        .when()
            .get("/app/v1/clientes/{id}",10L)
        .then()
            .status(HttpStatus.NOT_FOUND);
    }

    @Test
    public void deveRetornarBadRequest_quandoForInformadoUmParametroNaoDefinido(){
     given().accept(ContentType.JSON).when().get("/app/v1/clientes/{id}",-10L).then().status(HttpStatus.BAD_REQUEST);
     Mockito.verify(this.clienteServices,Mockito.never()).getById(-1L);
    }

}
