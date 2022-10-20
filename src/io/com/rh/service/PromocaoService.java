package io.com.rh.service;

import io.com.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {

        if (funcionario.isGerente()) {
            throw new IllegalArgumentException("Gerente não pode ser promovido!");
        }

        if (metaBatida) {
            funcionario.promover(funcionario.getCargo().proximoCargo());
        } else {
            throw new IllegalArgumentException("Funcionário não bateu a meta!");
        }


    }

}
