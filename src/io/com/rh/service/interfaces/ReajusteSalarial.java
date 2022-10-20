package io.com.rh.service.interfaces;

import io.com.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ReajusteSalarial {

    void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento);
}
