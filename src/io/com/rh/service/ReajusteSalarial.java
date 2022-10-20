package io.com.rh.service;

import io.com.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ReajusteSalarial {

    void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento);
}
