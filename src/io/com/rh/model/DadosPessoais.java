package io.com.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {

    private String nome;
    private String cpf;
    private Cargo cargo;

    public DadosPessoais(String nome, String cpf, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

}
